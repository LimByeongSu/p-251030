package day1.exam7

fun main(args: Array<String>){
    val names = mutableListOf("Alice", "Bob", "Carol")

    names.add("Daniel")

    for(name in names){
        println(name)
    }
}