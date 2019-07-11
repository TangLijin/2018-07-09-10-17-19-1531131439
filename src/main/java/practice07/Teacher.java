package practice07;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
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
        if(klass == null){
            System.out.print("I am a Teacher. I teach No Class.");
        }else{
            System.out.print("I am a Teacher. I teach Class " + klass.getNumber() + ".");
        }
    }

    public void introduceWith(Student student){
        super.introduce();
        if(student.getKlass() == this.klass){
            System.out.print("I am a Teacher. I teach " + student.getName() + ".");
        }else{
            System.out.print("I am a Teacher. I don't teach " + student.getName() + ".");
        }
    }
}