import java.util.Scanner;

public class Student {
    private String name;
    private int gradeYear;
    private String studentId;
    private int balance = 0;
    private String courses = "";
    private static int courseCost = 600;
    private static int id = 100;
    Scanner scanner = new Scanner(System.in);


    public Student(){
        System.out.print("Student name : ");
        this.name = scanner.nextLine();
        System.out.print("1)Freshman\n2)Sophomore\n3)Junior\n4)Senior\nEnter grade year : ");
        this.gradeYear = scanner.nextInt();
        scanner.nextLine();
        setStudentID();
    }
    public void showBalance(){
        System.out.println(name + ", your balance is " + balance);
    }
    //Pay tuition
    public void payTuition(){
        showBalance();
        System.out.println("How much would you like to pay ? ");
        int payment = scanner.nextInt();
        balance = balance - payment;
        System.out.println("Thank you for paying :" + payment + " remaining payment is : " + balance);
    }
    //Grade level
    public String gradeLevel(){
        if (gradeYear==1){
            return " Freshman";
        } else if (gradeYear==2) {
            return " Sophomore";
        } else if (gradeYear==3) {
            return " Junior";
        }else {
            return " Senior";
        }
    }
    //Show status
    public String showStatus(){
        return "Name :" + name
                +"\nGrade level :" + gradeLevel()
                +"\nStudent id : " + studentId
                +"\nCourses Enrolled :" + courses
                +"\nBalance : " + balance;
    }

    //Generate ID
    private void setStudentID(){
        id++;
        this.studentId = gradeYear+""+id;
    }

    //Enroll courses
    public void enrollCourses(){
        String courseList = "History 101\nMath101\nEnglish101\nComputer Science101";
        System.out.println(courseList);
        while (true) {
            System.out.print("Enter 'list' to see course list\nEnter 'q' when you're done\nEnter course to enroll :");
            String input = scanner.nextLine();
            if (input.equals("History 101") || input.equals("Math 101") || input.equals("English 101") || input.equals("Computer Science 101")){
                courses = courses + input;
                balance = balance + courseCost;
            }
            else if (input.equals("list")){
                System.out.println(courseList);
            } else if (input.equals("q")) {
                break;
            }
            else {
                System.out.println("Invalid operation");
            }
        }

    }

}
