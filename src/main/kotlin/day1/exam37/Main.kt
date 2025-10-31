package day1.exam37

/*
class Person(
    var name: String // var 사용 (자동으로 Getter와 Setter 생성)
) {
}
*/

class Person(
    private var _name: String
) {

    var name: String
        get() {
            if(_name.isEmpty()) {
                return "noname"
            }

            return _name
        }
        set(value) {
            if(value.isEmpty()) {
                println("이름은 공백일 수 없습니다.")
                _name = "noname"
            }
        }
}

fun main() {

    val p = Person("")

//        p.name = ""
    println(p.name)

}