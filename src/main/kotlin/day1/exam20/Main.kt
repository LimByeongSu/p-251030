package day1.exam20

fun main() {
    val name: String? = null
    val displayName: String = name ?: "Guest"

    println(displayName)
}