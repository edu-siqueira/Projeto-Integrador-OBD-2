package com.example.projeto_pi2.parameters.engine

import com.example.projeto_pi2.parameters.OBDCommand

class OilTemp(): OBDCommand(cmd = "01 5C\r") {
    private val oil_temp = -1;

    override fun convertToReadable(resposta: String): String {
        val byte_a = resposta.substring(11, 12).toLong(16)
        val result = byte_a - 40
        return result.toString()
    }

    override fun returnFormattedValue(): String {
        return "$oil_temp °C";
    }
}