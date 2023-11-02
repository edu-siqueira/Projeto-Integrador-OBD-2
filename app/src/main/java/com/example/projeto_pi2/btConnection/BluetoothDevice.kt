package com.example.projeto_pi2.btConnection

import android.bluetooth.BluetoothManager
import android.content.Context

typealias BluetoothDeviceDomain = BluetoothDevice

data class BluetoothDevice(
    val name: String?,
    val address: String
)