package day1.exam19

fun main(args: Array<String>) {
    val names = listOf("Alice", "Bob", "Carol", "Carol")

    names.map { "Hello, $it" }
        .forEach { println(it) }
}