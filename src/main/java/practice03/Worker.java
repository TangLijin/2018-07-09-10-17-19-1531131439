package practice03;

public class Worker extends Person{
    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public void introduce() {
        System.out.println("I am a Worker. I have a job.");
    }
}
