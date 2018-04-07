package practice08;

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

    public void assignLeader(Student jerry) {
        leader = jerry;
    }

    public Student getLeader() {
        return leader;
    }
}
