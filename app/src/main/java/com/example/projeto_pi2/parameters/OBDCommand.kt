package com.example.projeto_pi2.parameters

import android.bluetooth.BluetoothSocket
import android.util.Log
import java.io.InputStream
import java.io.OutputStream

abstract class OBDCommand (val cmd: String) {

    fun sendCommand (socket: BluetoothSocket?): String {
        try {
            val outputStream: OutputStream? = socket?.outputStream
            outputStream?.write(cmd.toByteArray());
            val resposta = receiveResponse(socket)
            return convertToReadable(resposta)
        } catch (e: Exception) {
            Log.d("Erro", e.toString())
            return e.toString()
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

    protected abstract fun convertToReadable(resposta: String): String;
    protected abstract fun returnFormattedValue(): String;
}