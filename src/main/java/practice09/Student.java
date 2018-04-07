package practice09;


public class Student extends Person {
    private int id;
    private String name;
    private int age;
    private Klass klass;

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Student(int id, String name, int age , Klass klass) {
        super(id, name, age);
        this.id = id;
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

    public Klass getKlass() {
        return klass;
    }



    public String introduce() {
        return super.introduce() + " " + "I am a Student. "+
                (getKlass().getLeader()==this?"I am Leader of Class ":"I am at Class ")+getKlass().getNumber()+".";
    }
}