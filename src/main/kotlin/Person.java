public class Person {

    int age;
    String name;

    public void sayHello(){
        System.out.println("hello, my name is "+name+"and i am "+age);
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
