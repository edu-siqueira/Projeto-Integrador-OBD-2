package com.example.projeto_pi2.parameters.engine

import com.example.projeto_pi2.parameters.OBDCommand

class RelativeAccPedalPos(): OBDCommand(cmd = "01 5A\r") {
    private val relative_acc = -1;

    override fun convertToReadable(resposta: String): String {
        val byte_a = resposta.substring(11, 12).toLong(16)
        val result = (100 / 255) * byte_a
        return result.toString()
    }

    override fun returnFormattedValue(): String {
        return "$relative_acc %";
    }
}