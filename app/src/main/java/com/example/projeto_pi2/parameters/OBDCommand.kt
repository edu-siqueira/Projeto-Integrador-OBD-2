package com.example.projeto_pi2.parameters

import android.Manifest
import android.content.Context
import android.bluetooth.BluetoothSocket
import android.content.pm.PackageManager
import android.content.ContextWrapper
import android.util.Log
import androidx.core.content.ContextCompat.checkSelfPermission
import java.io.InputStream
import java.io.OutputStream

abstract class OBDCommand (val cmd: String) {

    fun sendCommand (socket: BluetoothSocket?) {
        try {
            val outputStream: OutputStream? = socket?.outputStream
            outputStream?.write(cmd.toByteArray());
        } catch (e: Exception) {
            Log.d("Erro", e.toString())
        }
    }

    fun receiveResponse (socket: BluetoothSocket?): String {
        val inputStream: InputStream? = socket?.inputStream
        val buffer = ByteArray(1024);
        var bytes: Int?
        var response: String = "";
        bytes = inputStream?.read(buffer);
        bytes?.let {
            response = String(buffer, 0, bytes)
        }
        return response
    }

    protected abstract fun convertToReadable();
    protected abstract fun returnFormattedValue(): String;
}