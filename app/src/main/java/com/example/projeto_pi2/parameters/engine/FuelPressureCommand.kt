package com.example.projeto_pi2.parameters.engine

import com.example.projeto_pi2.parameters.OBDCommand

class FuelPressureCommand(): OBDCommand(cmd = "01 0A\r") {
    private val fuel_pressure = -1;

    override fun convertToReadable(resposta: String): String {
        val byte_a = resposta.substring(11, 12).toLong(16)
        val result = 3 * byte_a
        return result.toString()
    }

    override fun returnFormattedValue(): String {
        return "$fuel_pressure kPa";
    }
}