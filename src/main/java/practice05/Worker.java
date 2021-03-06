package practice05;


import practice04.Person;

public class Worker extends Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Worker(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return super.introduce() + " " + "I am a Worker. I have a job.";
    }
}