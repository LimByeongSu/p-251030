package day1.exam11

/*class Person(val name:String, val age:Int){

}*/

data class Person(
    var name:String, var age:Int
){

}
fun main(){
    val p1 = Person("Alice", 29)
    val p2 = Person("Alice", 29)

    println(p1)
    println(p1 == p2)
}