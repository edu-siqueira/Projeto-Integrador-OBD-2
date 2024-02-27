package com.example.projeto_pi2.parameters.engine

import com.example.projeto_pi2.parameters.OBDCommand

class RPMCommand() : OBDCommand(cmd = "01 0C\r") {
    private val rpm = -1;

    override fun convertToReadable(resposta: String): String {
        val byte_a = resposta.substring(11, 12).toLong(16)
        val byte_b = resposta.substring(14, 15).toLong(16)
        val result = ((256 * byte_a) + byte_b) / 4
        return result.toString()
    }

    override fun returnFormattedValue(): String {
        return "$rpm RPM";
    }

}