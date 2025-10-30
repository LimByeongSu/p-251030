package day1.exam10

fun main(args: Array<String>) {
    val names = listOf("Alice", "Bob", "Charlie")

    names.forEach {name -> println(name)}
    names.forEach{println(it)}
}