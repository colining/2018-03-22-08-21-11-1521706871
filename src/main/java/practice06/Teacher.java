package practice06;

public class Teacher extends Person {
    private String name;
    private int age;
    private int klass;

    public Teacher(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getKlass() {
        return klass;
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public String introduce() {
        return super.introduce() + " " + "I am a Teacher. I teach " + (getKlass()==0?"No Class":("Class "+getKlass())) + ".";
    }
}