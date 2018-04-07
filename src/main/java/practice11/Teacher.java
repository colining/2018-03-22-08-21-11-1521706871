package practice11;

import java.util.*;
import java.util.Observer;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private int id;
    private String name;
    private int age;
    private HashSet<Klass> classes;
    private HashSet<Klass> subjects;
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
        classes.forEach(x->{
            x.attach(this);
        });
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

    public boolean isTeaching(Student student) {
        return classes.contains(student.getKlass());
    }

    public String introduceWith(Student student) {
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. " + (isTeaching(student) ? ("I teach ") : ("I don't teach ")) + student.getName() + ".";

    }

    public String introduce() {
        if (classes == null) {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach No Class.";
        }
        StringBuilder c = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        classes.forEach(x-> list.add(x.getNumber()));
        Collections.sort(list);
        list.forEach(integer -> c.append(" " + integer + ","));
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach Class" + c.substring(0, c.length() - 1) + ".";
    }


    public void updateAppendMember(Student student) {
        if (isTeaching(student)) {
            String s = "I am "+ getName() +"."+" I know "+student.getName()+" has joined Class "+student.getKlass().getNumber()+".";
            System.out.println(s);
        }
    }

    public void updateAssignLeader(Student student) {
        if (isTeaching(student)) {
            String s1 = "I am Tom. I know Jerry become Leader of Class 2.\n";
            String s = "I am "+ getName() +"."+" I know "+student.getName()+" become Leader of Class "+student.getKlass().getNumber()+".";
            System.out.println(s);
        }
    }
}