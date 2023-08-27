/*import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }

    @Override
    public String toString() {
        return "Student: " + name + ", Average Grade: " + getAverageGrade();
    }
}

public class L2_task2 {
    private List<Student> students;

    public L2_task2() {
        this.students = new ArrayList<>();
    }

    public void addStudent(String name) {
        Student student = new Student(name);
        students.add(student);
    }

    public void addGrade(String name, int grade) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                student.addGrade(grade);
                break;
            }
        }
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public void displayTopPerformingStudents(int count) {
        if (students.isEmpty()) {
            System.out.println("No students found!");
        } else {
            students.sort((s1, s2) -> Double.compare(s2.getAverageGrade(), s1.getAverageGrade()));
            int displayCount = Math.min(count, students.size());
            for (int i = 0; i < displayCount; i++) {
                System.out.println(students.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        L2_task2 analyzer = new L2_task2();

        while (true) {
            System.out.println("Student Grade Analyzer Menu:");
            System.out.println("1. Add student");
            System.out.println("2. Add grade");
            System.out.println("3. Display all students");
            System.out.println("4. Display top performing students");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Exiting Student Grade Analyzer");
                    scanner.close();
                    return;
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    analyzer.addStudent(name);
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = scanner.nextInt();
                    scanner.nextLine();
                    analyzer.addGrade(studentName, grade);
                    System.out.println("Grade added successfully!");
                    break;
                case 3:
                    analyzer.displayStudents();
                    break;
                case 4:
                    System.out.print("Enter the number of top performing students to display: ");
                    int count = scanner.nextInt();
                    scanner.nextLine();
                    analyzer.displayTopPerformingStudents(count);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println();
        }
    }
}
*/