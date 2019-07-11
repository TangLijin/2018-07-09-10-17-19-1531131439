package practice05;

public class Worker extends Person {
    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.print("I am a Worker. I have a job.");
    }
}