package com.example.projeto_pi2.parameters.engine

import com.example.projeto_pi2.parameters.OBDCommand

class SpeedCommand() : OBDCommand(cmd = "01 0D\r") {
    private val speed = -1;

    override fun convertToReadable(resposta: String): String {
        val byte_a = resposta.substring(11, 12).toLong(16)
        val result = byte_a
        return result.toString()
    }

    override fun returnFormattedValue(): String {
        return "$speed km/h";
    }
}