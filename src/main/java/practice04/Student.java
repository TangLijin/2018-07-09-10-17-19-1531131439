package practice04;

public class Student extends Person{
    private String Class;

    public Student(String name, int age, String aClass) {
        super(name, age);
        Class = aClass;
    }

    public String getTheClass() {
        return Class;
    }

    public void setClass(String aClass) {
        Class = aClass;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.print("I am a Student. I am at Class " + Class + ".");
    }
}
