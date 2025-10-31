package day1.exam32

open class Animal{
    open fun makeSound(){
        println("Animal Sound")
    }
}

class Dog : Animal(){
    override fun makeSound() {
        super.makeSound()
    }
}

fun main(){

}