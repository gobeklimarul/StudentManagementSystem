import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students would you like to add ? ");
        int numberOfStudents = scanner.nextInt();
        //
        Student[] students = new Student[numberOfStudents];
        for (int i =0; i<numberOfStudents; i++){
            students[i] = new Student();
            students[i].enrollCourses();
            students[i].payTuition();
            System.out.println(students[i].showStatus());
        }


    }
}
