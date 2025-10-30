package day1.exam18

fun main(args: Array<String>) {
    val numbers = listOf(1,2,3,4,5,6) //listOf는 불변

    val rst = numbers.filter { it % 2 == 0 }
    println(rst)
}