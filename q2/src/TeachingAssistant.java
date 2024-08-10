public class TeachingAssistant extends Staff {
    private int numberOfSubject;
    private double salary;

    public TeachingAssistant(String fullName, int dayOfBirth, int personalID, int numberOfSubject, double salary) {
        super(fullName, dayOfBirth, personalID);
        this.numberOfSubject = numberOfSubject;
        this.salary = salary;
    }

    public int getNumberOfSubject() {
        return numberOfSubject;
    }

    public void setNumberOfSubject(int numberOfSubject) {
        this.numberOfSubject = numberOfSubject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "TeachingAssistant [numberOfSubject=" + numberOfSubject + ", salary=" + salary + "]";
    }

}
