public class Lecturer extends Staff {
    private String academicRank;
    private String academicDegree;
    private int yearsOfWorkExperience;
    private double salary;
    private int subject;

    public Lecturer(String fullName, int dayOfBirth, int personalID, String academicRank, String academicDegree,
            int yearsOfWorkExperience, double salary, int subject) {
        super(fullName, dayOfBirth, personalID);
        this.academicRank = academicRank;
        this.academicDegree = academicDegree;
        this.yearsOfWorkExperience = yearsOfWorkExperience;
        this.salary = salary;
        this.subject = subject;
    }

    public String getAcademicRank() {
        return academicRank;
    }

    public void setAcademicRank(String academicRank) {
        this.academicRank = academicRank;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public int getYearsOfWorkExperience() {
        return yearsOfWorkExperience;
    }

    public void setYearsOfWorkExperience(int yearsOfWorkExperience) {
        this.yearsOfWorkExperience = yearsOfWorkExperience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSubject() {
        return subject;
    }

    public void setSubject(int subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Lecturer [academicRank=" + academicRank + ", academicDegree=" + academicDegree
                + ", yearsOfWorkExperience=" + yearsOfWorkExperience + ", salary=" + salary + ", subject=" + subject
                + "]";
    }
}