package practice10;

public class Klass {
    private int number;
    private Student leader;

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
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student tom) {
        tom.setKlass(this);
    }
}
