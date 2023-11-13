package com.example.projeto_pi2

import android.Manifest
import android.content.Context
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothManager
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build

import android.graphics.Color
import android.os.Bundle
import android.util.Log
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
import com.example.projeto_pi2.ui.screens.telaInicial.*

private const val ENABLE_BLUETOOTH_REQUEST_CODE = 1

class MainActivity : ComponentActivity() {
    // Inicializando adaptador Bluetooth
    private val bluetoothAdapter: BluetoothAdapter by lazy {
        val bluetoothManager = getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
        bluetoothManager.adapter
    }

    // Pedindo permissão para ativar Bluetooth
    private fun checkAndroidVersion () {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            // Android 11-
            this.requestPermissions.launch(arrayOf(
                Manifest.permission.BLUETOOTH_SCAN,
                Manifest.permission.BLUETOOTH_CONNECT
            ))
        } else {
            // Android 12+
            this.requestBluetooth()
        }
    }

    private val requestPermissions = registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { permissions ->
        permissions.entries.forEach {
            Log.d("test006", "${it.key} = ${it.value}")
        }
    }

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

    private fun getPairedDevices(): Set<BluetoothDevice> {
        var pairedDevices: Set<BluetoothDevice> = emptySet()
        if (checkSelfPermission(Manifest.permission.BLUETOOTH_SCAN) == PackageManager.PERMISSION_GRANTED) {
            pairedDevices = bluetoothAdapter.bondedDevices
            pairedDevices?.forEach { device ->
                val deviceName = device.name
                val deviceHardwareAddress = device.address
            }
        }
       return pairedDevices
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.checkAndroidVersion();
        if(!bluetoothAdapter.isEnabled) {
            requestBluetooth();
        }
        this.getPairedDevices();
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
                                Tela_Inicial(emailTextContent = "Email",
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


