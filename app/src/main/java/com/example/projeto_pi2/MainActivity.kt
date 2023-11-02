package com.example.projeto_pi2

import android.content.Context
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothManager
import android.content.Intent

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projeto_pi2.frame1.Frame1
import com.example.projeto_pi2.frame2.Frame2
import com.example.projeto_pi2.frame3.Frame3
import com.example.projeto_pi2.frame4.Frame4
import com.example.projeto_pi2.ui.theme.Projetopi2Theme

private const val ENABLE_BLUETOOTH_REQUEST_CODE = 1

class MainActivity : ComponentActivity() {
    // Inicializando adaptador Bluetooth
    private val bluetoothAdapter: BluetoothAdapter by lazy {
        val bluetoothManager = getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
        bluetoothManager.adapter
    }

    // Pedindo permissão para ativar Bluetooth
    private val activityResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        result ->
        if (result.resultCode == RESULT_OK) {
            // Continuar
        } else {
            // Mostrar mensagem de erro: bluetooth desativado
            print("Ligue o bluetooth para utilizar o aplicativo")
        }
    }

    private fun requestBluetooth() {
        val enableByIntent = Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
        activityResultLauncher.launch(enableByIntent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(!bluetoothAdapter.isEnabled) {
            requestBluetooth()
        }
        setContent {
            Projetopi2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "tela_inicial"
                    ) {
                        composable("tela_inicial", ) {
                            EnterAnimation {
                                Frame1(emailTextContent = "Email",
                                    senhaTextContent = "Senha",
                                    entrarTextContent = "Entrar",
                                    sejaBemVindoTextContent = "Seja Bem-Vindo!",
                                    esqueceuASenhaTextContent = "esqueceu a senha?",
                                    criarUmaContaTextContent = "Criar uma conta",
                                    onClick = {navController.navigate("tela_principal")}
                                )
                            }
                        }
                        composable("tela_principal") {
                            EnterAnimation {
                                Frame2(errorsCountTextContent = "3 erro(s) detectados!",
                                    voltsTextContent = "14.5 Volts",
                                    rpmTextContent = "1.190",
                                    param67TextContent = "67%",
                                    onSettingsClick = {navController.navigate("tela_de_opcoes")},
                                    onErrorClick = {navController.navigate("tela_de_erros")},)
                            }
                        }
                        composable("tela_de_opcoes"){
                            EnterAnimation {
                                Frame3(onSettingsClick = {navController.navigate("tela_principal")})
                            }
                        }
                        composable("tela_de_erros"){
                           EnterAnimation {
                               Frame4(onSettingsClick = {navController.navigate("tela_principal")})
                           }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Projetopi2Theme {
        Greeting("Android")
    }
}

@Composable
fun EnterAnimation(content: @Composable () -> Unit) {
    AnimatedVisibility(
        visibleState = MutableTransitionState(
            initialState = false
        ).apply { targetState = true },
        modifier = Modifier,
        enter = slideInVertically(
            initialOffsetY = { -40 }
        ) + expandVertically(
            expandFrom = Alignment.Top
        ) + fadeIn(initialAlpha = 0.3f),
        exit = slideOutVertically() + shrinkVertically() + fadeOut(),
    ) {
        content()
    }
}


