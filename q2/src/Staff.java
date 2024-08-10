public class Staff {
    private String fullName;
    private int dayOfBirth;
    private int personalID;

    public Staff(String fullName, int dayOfBirth, int personalID) {
        this.fullName = fullName;
        this.dayOfBirth = dayOfBirth;
        this.personalID = personalID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getPersonalID() {
        return personalID;
    }

    public void setPersonalID(int personalID) {
        this.personalID = personalID;
    }

    @Override
    public String toString() {
        return "Staff [fullName=" + fullName + ", dayOfBirth=" + dayOfBirth + ", personalID=" + personalID + "]";
    }

}
