package day1.exam14

class Test{

}

object Singleton{
    fun showMessage(){
        println("Hello World")
    }
}

fun main(){
    Singleton.showMessage()
    val a = Singleton
    val b = Singleton

    println(a==b)

    val c = Test()
    val d = Test()
    println(d==c)


}