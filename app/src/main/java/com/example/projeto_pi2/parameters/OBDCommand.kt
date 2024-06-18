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

    fun sendCommand (outputStream: OutputStream?, inputStream: InputStream?): Int {
        try {
            val bytes: Int?
            var response = "";
            val buffer = ByteArray(2048);
            outputStream?.write(cmd.toByteArray());
            Log.d("Comando", cmd)
            Thread.sleep(1000)
            bytes = inputStream?.read(buffer);
            bytes?.let {
                response = String(buffer, 0, bytes)
            }
            Log.d("RPM", response)
            val byte_a = response.substring(6, 8).toLong(16)
            Log.d("Byte A", byte_a.toString())
            val byte_b = response.substring(9, 11).toLong(16)
            Log.d("Byte B", byte_b.toString())
            val result = ((256 * byte_a) + byte_b) / 4
            return result.toInt()
        } catch (e: Exception) {
            Log.d("Erro", e.toString())
            return 0
        }
    }

    fun receiveResponse (socket: BluetoothSocket?): String {
        var inputStream: InputStream? = socket?.inputStream
        var buffer = ByteArray(2048);
        var bytes: Int?
        var response = "";
        bytes = inputStream?.read(buffer);
        bytes?.let {
            response = String(buffer, 0, bytes)
        }
        Log.d("RPM", response)
        return response
    }


    protected abstract fun convertToReadable(resposta: String): String;
    protected abstract fun returnFormattedValue(): String;
}