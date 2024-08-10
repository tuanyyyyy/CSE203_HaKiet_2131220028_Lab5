package q3.src;

public abstract class Student implements Comparable<Student> {
    protected String studenNumber;
    protected String studentName;
    protected int credit;
    protected double studentScore;

    public Student(String studenNumber, String studentName, int credit, double studentScore) {
        this.studenNumber = studenNumber;
        this.studentName = studentName;
        this.credit = credit;
        this.studentScore = studentScore;
    }

    public String getStudenNumber() {
        return studenNumber;
    }

    public void setStudenNumber(String studenNumber) {
        this.studenNumber = studenNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public double getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(double studentScore) {
        this.studentScore = studentScore;
    }

    @Override
    public String toString() {
        return "Student [studenNumber=" + studenNumber + ", studentName=" + studentName + ", credit=" + credit
                + ", studentScore=" + studentScore + "]";
    }

    protected abstract boolean isGraduated();

  
}