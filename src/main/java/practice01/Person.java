package practice01;

public class Person {
    private int age;
    private String name;

    public Person(String name,int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void introduce(){
        System.out.println(">My name is " + name + ". I am " + age + " years old.");
    }
}
