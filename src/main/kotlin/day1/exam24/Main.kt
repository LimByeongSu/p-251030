package day1.exam24

fun main(args: Array<String>) {
    val name: String? = "hello"

    val len = name?.length ?: 0
    println(len)

    val rst = name?.let {
        println(it.length)
        10
        50
        it
    }
    println(rst)
}