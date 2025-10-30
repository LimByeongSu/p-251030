package day1.exam13

fun sayHello(name:String = "Alice"){
    println("Hello ${name}")
}

fun main(){
    sayHello()
    sayHello("Bob")
}