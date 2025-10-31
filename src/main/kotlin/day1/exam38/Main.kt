package day1.exam38

class Person(val name: String, val age: Int) {
    fun introduce() {
        println("Hi, I'm $name and I'm $age years old.")
    }
}
/*
class Person(val name: String, val age: Int) {
    init {
        println("Person 객체가 생성되었습니다: $name, $age")
    }
}*/

fun main() {
    val person = Person("Alice", 25)
    person.introduce()
}