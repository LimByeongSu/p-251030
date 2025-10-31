package day1.exam35

class Person {
    val name: String = "Unknown" // val 사용 (자동으로 Getter 생성)
}

fun main() {
    val person = Person()
    person.name
}