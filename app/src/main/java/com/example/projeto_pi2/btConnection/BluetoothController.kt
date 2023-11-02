package com.example.projeto_pi2.btConnection

import android.content.Context
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothManager
import android.content.Intent
import androidx.activity.ComponentActivity
import androidx.activity.result.contract.ActivityResultContracts

private val activityResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        result ->
    if (result.resultCode == ComponentActivity.RESULT_OK) {
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