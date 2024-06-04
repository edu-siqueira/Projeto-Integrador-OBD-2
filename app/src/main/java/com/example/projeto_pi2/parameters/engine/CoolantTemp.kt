package com.example.projeto_pi2.parameters.engine

import com.example.projeto_pi2.parameters.OBDCommand

class CoolantTemp(): OBDCommand(cmd = "01 05\r") {
    private val coolant_temp = -1;

    override fun convertToReadable(resposta: String): String {
        val byte_a = resposta.substring(11, 12).toLong(16)
        val result = byte_a - 40
        return result.toString()
    }

    override fun returnFormattedValue(): String {
        return "$coolant_temp °C";
    }
}