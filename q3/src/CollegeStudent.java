package q3.src;

public class CollegeStudent extends Student {
    private double examScore;

    public CollegeStudent(String studenNumber, String studentName, int credit, double studentScore, double examScore) {
        super(studenNumber, studentName, credit, studentScore);
        this.examScore = examScore;
    }

    @Override
    public String toString() {
        return "CollegeStudent [examScore=" + examScore + "]";
    }

    public boolean isGraduated() {
        if (credit >= 100 && studentScore >= 5 && examScore >= 5)
            return true;
        else
            return false;
    }

    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    public double getExamScore() {
        return examScore;
    }

    public void setExamScore(double examScore) {
        this.examScore = examScore;
    }

}
