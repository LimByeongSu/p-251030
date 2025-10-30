package day1.exam8

fun main(args: Array<String>){
    val ages = mutableMapOf("Alice" to 30, "Clark" to 20, "Dan" to 40)
    ages.put("A", 60)
    for((key, value) in ages){
        println("$key -> $value")
    }

}