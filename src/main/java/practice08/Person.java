package practice08;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return basicIntroduce();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String basicIntroduce(){
        return "My name is " + getName() + ". I am " + getAge() + " years old.";
    }
}
