package utils

import models.Data
import models.Rule

fun readInputs() = getResource("/datafile").split("\n").map { Data(it.split(",")) }

fun readRules() = arrayOf("binary_add.tur", "example.tur", "pali.tur","prime.tur", "rpnbool.tur")
    .map { filename ->
        Pair(
            filename,
            getResource("/$filename").split("\n")
                .map { it.replaceAfterLast(";", "", it).replace(";","").trim() }
                .filter { it.isNotBlank() }
                .map { Rule(it.split(" ")) }
        )
    }.associate { it }

private fun getResource(resource: String): String {
    return  {}::class.java.getResource(resource).readText()
}