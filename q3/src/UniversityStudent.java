package q3.src;

public class UniversityStudent extends Student {

    private String thesisName;
    private double thesisScore;

    public UniversityStudent(String studenNumber, String studentName, int credit, double studentScore,
            String thesisName, double thesisScore) {
        super(studenNumber, studentName, credit, studentScore);
        this.thesisName = thesisName;
        this.thesisScore = thesisScore;
    }

    public boolean isGraduated() {
        if (credit >= 150 && studentScore >= 5 && thesisScore >= 5)
            return true;
        else
            return false;

    }

    public String getThesisName() {
        return thesisName;
    }

    public void setThesisName(String thesisName) {
        this.thesisName = thesisName;
    }

    public double getThesisScore() {
        return thesisScore;
    }

    public void setThesisScore(double thesisScore) {
        this.thesisScore = thesisScore;
    }

    @Override
    public String toString() {
        return "UniversityStudent [thesisName=" + thesisName + ", thesisScore=" + thesisScore + "]";
    }

    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

}
