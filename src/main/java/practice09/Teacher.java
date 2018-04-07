package practice09;

public class Teacher extends Person {
    private int id;
    private String name;
    private int age;
    private Klass klass;

    public Teacher(int id, String name, int age,  Klass klass) {
        super(id, name, age);
        this.id = id;
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.id = id;
        this.name = name;
        this.age = age;
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