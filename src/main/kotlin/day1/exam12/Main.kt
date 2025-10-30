package day1.exam12

fun String.greet(){
    println("Hello ${this}")
}

fun List<Int>.square(): List<Int>{
    val rst = this.map{a->a*a}
    return rst
}

fun main(args: Array<String>) {
    val name = "Alice"
    name.greet()

    val intList = listOf(1,2,3,4,5)

    val avg = intList.average()  //기본 제공 함수
    println(avg)
    val rst = intList.square()  //내가 만든 함수
    println(rst)
}