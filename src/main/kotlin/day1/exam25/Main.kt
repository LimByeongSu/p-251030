package day1.exam25

fun main() {
    val length = "Hello".also {//also의 결과로 객체가 반환되고
        println("Before: $it")
    }.uppercase().also {//객체.uppercase().also() 상태이다.
        println("After: $it")
    }.length//객체.length 상태이다.

    println("Length: $length")

    // apply => this를 받고 객체를 반환
    // let => it을 받고 람다의 결과값 반환
    // also => it을 받고 객체를 반환
    //자연스럽게 run은 this를 받고 람다의 결과값을 반환?
}