package day1.exam6

fun main(){
    val p1 = Person("Alice", 20)
    p1.greet()
}

class Person(val name: String, val age: Int) {

    

    fun greet(){
        println("Hello, ${name}")
    }
}