package models

data class Data(val rulefile: String, val input: String) {
    constructor(list: List<String>) : this(list.first(), list.last())
}