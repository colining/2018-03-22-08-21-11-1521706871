package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Teacher> observers = new ArrayList<Teacher>();
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Klass(int number) {

        this.number = number;
    }

    public String getDisplayName() {
        return "Class "+getNumber();
    }

    public void assignLeader(Student student) {
        if (student.getKlass() != this) {
            System.out.println("It is not one of us.");
            return;
        }
        leader = student;
        notifyAboutAssignLeader(student);
    }

    private void notifyAboutAssignLeader(Student student) {
        for (Teacher observer : observers) {
            observer.updateAssignLeader(student);
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        notifyAboutAppendMember(student);
    }

    public void attach(Teacher observer){
        observers.add(observer);
    }

    public void notifyAboutAppendMember(Student student){
        for (Teacher observer : observers) {
            observer.updateAppendMember(student);
        }
    }
}
