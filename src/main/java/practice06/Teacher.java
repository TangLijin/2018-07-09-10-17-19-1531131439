package practice06;

public class Teacher extends Person {
    private String Class;

    public Teacher(String name, int age, String aClass) {
        super(name, age);
        Class = aClass;
    }

    public Teacher(String name, int age) {
        super(name, age);
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
        if(Class == null){
            System.out.print("I am a Teacher. I teach No Class.");
        }else{
            System.out.print("I am a Teacher. I teach Class " + Class + ".");
        }
    }
}
