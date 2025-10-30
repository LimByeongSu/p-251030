package day1.exam21

fun main(args: Array<String>) {
    val obj:Any = "Hello, world!"

    //println(obj.length)
    if(obj is String){
        println(obj.length)
    }
}