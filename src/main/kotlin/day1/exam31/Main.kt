package day1.exam31

class MathUtil {

    companion object {  //문법적 약속으로 object를 클래스 안에서 쓸땐 companion을 붙여야함

        val PI = 3.141569

        fun square(n: Int): Int {
            return n * n
        }
    }

}

fun main() {
    MathUtil.square(5).also {
        println(it)
    }

    MathUtil.PI.also {
        println(it)
    }

}