package day1.exam36

class Person(
    var name: String = ""
){

}

fun main(){
    val p = Person("Alice")

    p.name = "Alice"
    println(p.name)
}