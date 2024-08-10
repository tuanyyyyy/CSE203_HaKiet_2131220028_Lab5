package q3.src;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class Demo {
    private static Vector<Student> students = new Vector<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.println("Menu:");
            System.out.println("1. Add a new college student.");
            System.out.println("2. Add a new university student.");
            System.out.println("3. Remove a student.");
            System.out.println("4. Print student list.");
            System.out.println("5. Print the list of students eligiblegraduation.");
            System.out.println("6. Sort student list.");
            System.out.println("7. Find student");
            System.out.println("8. Exit.");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addCollegeStudent(sc);
                    break;
                case 2:
                    addUniversityStudent(sc);
                    break;
                case 3:
                    removeStudent(sc);
                    break;
                case 4:
                    printStudentList();
                    break;
                case 5:
                    printEligibleGraduates();
                    break;
                case 6:
                    sortStudentList();
                    break;
                case 7:
                    findStudentByName(sc);
                    break;
                case 8:
                    sc.close();
                    return;

            }
        }
    }

    private static void addCollegeStudent(Scanner sc) {

        Scanner inputFile = new Scanner("College.Dat");

        System.out.print("Enter student number: ");
        String studentNumber = inputFile.nextLine();
        System.out.print("Enter full name: ");
        String fullName = inputFile.nextLine();
        System.out.print("Enter total credits: ");
        int totalCredits = inputFile.nextInt();
        System.out.print("Enter average score: ");
        double averageScore = inputFile.nextDouble();
        System.out.print("Enter graduation exam score: ");
        double graduationExamScore = inputFile.nextDouble();
        sc.nextLine();
        students.add(new CollegeStudent(studentNumber, fullName, totalCredits, averageScore, graduationExamScore));
        inputFile.close();
    }

    private static void addUniversityStudent(Scanner sc) {

        Scanner inputFile = new Scanner("University.Dat");

        System.out.print("Enter student number: ");
        String studentNumber = inputFile.nextLine();
        System.out.print("Enter full name: ");
        String fullName = inputFile.nextLine();
        System.out.print("Enter credits: ");
        int totalCredits = inputFile.nextInt();
        System.out.print("Enter average score: ");
        double averageScore = inputFile.nextDouble();
        sc.nextLine();
        System.out.print("Enter thesis name: ");
        String thesisName = inputFile.nextLine();
        System.out.print("Enter thesis score: ");
        double thesisScore = inputFile.nextDouble();
        sc.nextLine();

        students.add(
                new UniversityStudent(studentNumber, fullName, totalCredits, averageScore, thesisName, thesisScore));

        inputFile.close();
    }

    private static void removeStudent(Scanner sc) {

        Scanner inputFile = new Scanner("Result.Dat");
        System.out.print("Enter student number to remove: ");
        String studentNumber = inputFile.nextLine();
        students.removeIf(student -> student.studenNumber.equals(studentNumber));
        inputFile.close();
    }

    private static void printStudentList() {
        Scanner inputFile = new Scanner("Result.Dat");
        for (Student student : students) {
            System.out.println(student);

            inputFile.close();
        }
    }

    private static void printEligibleGraduates() {
        Scanner inputFile = new Scanner("Result.Dat");
        int count = 0;
        for (Student student : students) {
            if (student.isGraduated()) {
                System.out.println(student);
                count++;
            }
        }
        System.out.println("Number of students eligible graduation: " + count);
        inputFile.close();
    }

    private static void sortStudentList() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int typeComparison = s1.getClass().getSimpleName().compareTo(s2.getClass().getSimpleName());
                if (typeComparison != 0) {
                    return typeComparison;
                }
                return s1.studenNumber.compareTo(s2.studenNumber);
            }
        });
    }

    private static void findStudentByName(Scanner sc) {
        System.out.print("Enter full name to search: ");
        String fullName = sc.nextLine();
        for (Student student : students) {
            if (student.studentName.contains(fullName)) {
                System.out.println(student);
            }
        }
    }
}
