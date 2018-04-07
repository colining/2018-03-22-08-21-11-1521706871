package practice07;

public class Teacher extends Person {
    private String name;
    private int age;
    private Klass klass;
    public Teacher(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public String introduce() {
        return super.introduce() + " " + "I am a Teacher. I teach " + (getKlass()==null?"No Class":getKlass().getDisplayName()) + ".";
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduceWith(Student student) {
        return super.introduce() + " " + "I am a Teacher. "+
                (getKlass().getNumber()==student.getKlass().getNumber()?("I teach "+student.getName()):("I don't teach "+student.getName()  ))+".";

    }
}