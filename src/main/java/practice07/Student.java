package practice07;

public class Student extends Person{
    private Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.print("I am a Student. I am at Class " + klass.getNumber() + ".");
    }
}

