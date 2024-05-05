package com.example.projeto_pi2

import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothSocket
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
//import com.example.projeto_pi2.frame3.Frame3
//import com.example.projeto_pi2.frame4.Frame4
import com.example.projeto_pi2.telaPrincipal.Tela_Principal
import com.example.projeto_pi2.ui.screens.telaInicial.Tela_Inicial
import com.example.projeto_pi2.ui.theme.Projetopi2Theme
import java.io.InputStream
import java.io.OutputStream
import java.util.UUID
import kotlinx.coroutines.delay
import com.example.projeto_pi2.parameters.OBDCommand
import com.example.projeto_pi2.parameters.engine.RPMCommand

private const val ENABLE_BLUETOOTH_REQUEST_CODE = 1
private var MY_UUID = UUID.fromString("00001101-0000-1000-8000-00805f9b34fb")

var RPM = RPMCommand()

class MainActivity : ComponentActivity() {
    // Inicializando adaptador Bluetooth
//    private val bluetoothAdapter: BluetoothAdapter by lazy {
//        val bluetoothManager = getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
//        bluetoothManager.adapter
//    }

    // Pedindo permissão para ativar Bluetooth
//    private fun checkAndroidVersion () {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
//            // Android 11-
//            this.requestPermissions.launch(arrayOf(
//                Manifest.permission.BLUETOOTH_SCAN,
//                Manifest.permission.BLUETOOTH_CONNECT
//            ))
//        } else {
//            // Android 12+
//            this.requestBluetooth()
//        }
//    }

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
                val deviceUUID = device.uuids
                Log.d("Nomes", device.name.toString())
                Log.d("MAC", device.address.toString())
                Log.d("UUID", device.uuids[0].uuid.toString())
            }
        }
        return pairedDevices
    }

    private fun getSocket(): BluetoothSocket? {
        val obddevice: BluetoothDevice? = bluetoothAdapter.getRemoteDevice("AA:BB:CC:11:22:33");
        var socket: BluetoothSocket? = null;
        try {
            if (checkSelfPermission(Manifest.permission.BLUETOOTH_SCAN) == PackageManager.PERMISSION_GRANTED) {
                socket = obddevice?.createRfcommSocketToServiceRecord(MY_UUID);
            }
            return socket;
        } catch (error: Exception) {
            // Criar aviso que não achou o OBDII
            Log.d("Scanner", error.toString())
            return socket
        }
    }

    private fun initializeAdapter(socket: BluetoothSocket?) {
        // atz, atl1, ath0, atsp0
        try {
            val set_default = "AT D\r"
            val reset = "AT Z\r"
            val echo = "AT E1\r"
            val feed = "AT L0\r"
            val spaces = "AT S1\r"
            val headers = "AT H0\r"
            val protocol = "AT SP 0\r"
            val outputStream: OutputStream? = socket?.outputStream
            val inputStream: InputStream? = socket?.inputStream
            outputStream?.write(set_default.toByteArray());
            Thread.sleep(1000)
            outputStream?.write(reset.toByteArray());
            Thread.sleep(1000)
            outputStream?.write(echo.toByteArray());
            Thread.sleep(1000)
            outputStream?.write(feed.toByteArray())
            Thread.sleep(1000)
            outputStream?.write(spaces.toByteArray());
            Thread.sleep(1000)
            outputStream?.write(headers.toByteArray());
            Thread.sleep(1000)
            outputStream?.write(protocol.toByteArray());
        } catch (e: Exception) {
            Log.d("Adaptador", e.toString())
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.checkAndroidVersion();
        if (!bluetoothAdapter.isEnabled) {
            requestBluetooth();
        }
        val socket = getSocket()*/

        if (checkSelfPermission(Manifest.permission.BLUETOOTH_SCAN) == PackageManager.PERMISSION_GRANTED){
            try {
                socket?.let {
                    bluetoothAdapter.cancelDiscovery()
                    socket.connect();
                    initializeAdapter(socket)
                }
            } catch (e: Exception) {
                Log.d("Socket", e.toString())
            }
        }

        setContent {
            Projetopi2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    val rpmViewer = RPMViewer()

                    NavHost(
                        navController = navController,
                        startDestination = "tela_inicial"
                    ) {
                        composable("tela_inicial") {
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
                                Tela_Principal(
                                    errorsCountTextContent = "3 erro(s) detectados!",
                                    voltsTextContent = "14.5 Volts",
                                    rpmTextContent = rpmViewer,
                                    param67TextContent = "67%",
                                    onSettingsClick = { navController.navigate("tela_de_opcoes") },
                                    onErrorClick = { navController.navigate("tela_de_erros") },
                                )
                            }
                        }
//                        composable("tela_de_opcoes"){
//                            EnterAnimation {
//                                Frame3(onSettingsClick = {navController.navigate("tela_principal")})
//                            }
//                        }
//                        composable("tela_de_erros"){
//                           EnterAnimation {
//                               Frame4(onSettingsClick = {navController.navigate("tela_principal")})
//                           }
//                        }
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
@Composable
fun RPMViewer(): String {

    var rotacoes by remember { mutableStateOf(0) }

    LaunchedEffect(key1 = true) {
        while (true) {
            delay(1000)
            rotacoes = RPM.sendCommand().toInt()
        }
    }

    return rotacoes.toString()
}