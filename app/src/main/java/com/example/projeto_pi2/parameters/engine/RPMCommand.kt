package com.example.projeto_pi2.parameters.engine

import com.example.projeto_pi2.parameters.OBDCommand

class RPMCommand() : OBDCommand(cmd = "01 0C\r") {
    private val rpm = -1;

    override fun convertToReadable() {

    }

    override fun returnFormattedValue(): String {
        return "$rpm RPM";
    }

}