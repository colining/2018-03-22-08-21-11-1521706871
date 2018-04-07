package practice10;

import java.util.Collection;
import java.util.HashSet;

public class Teacher extends Person {
    private int id;
    private String name;
    private int age;
    private HashSet<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Teacher(int id, String name, int age, HashSet<Klass> classes) {
        super(id, name, age);
        this.id = id;
        this.name = name;
        this.age = age;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public HashSet<Klass> getClasses() {
        return classes;
    }

    public boolean isTeaching(Student jerry) {
        return classes.contains(jerry.getKlass());
    }

    public String introduceWith(Student student) {
        return "My name is "+getName()+". I am "+getAge()+" years old. I am a Teacher. "+(isTeaching(student)?("I teach "):("I don't teach "))+student.getName()+".";

    }
    public String introduce() {
        if (classes == null) {
            return "My name is "+getName()+". I am "+getAge()+" years old. I am a Teacher. I teach No Class.";
        }
        StringBuilder c = new StringBuilder();
        classes.forEach(x -> c.append(" "+x.getNumber()+","));
        return "My name is "+getName()+". I am "+getAge()+" years old. I am a Teacher. I teach Class"+c.substring(0,c.length()-1)+".";
    }
}