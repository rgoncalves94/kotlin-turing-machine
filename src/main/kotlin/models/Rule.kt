package models

data class Rule(val currentState: String, val currentSymbol: String, val newSymbol: String, val direction: String, val newState: String) {
    constructor(list: List<String>) : this(list[0], list[1], list[2], list[3], list[4])
}