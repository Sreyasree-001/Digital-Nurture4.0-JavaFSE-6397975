import controller.StudentController;
import model.Student;
import view.StudentView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Id: ");
        long id = sc.nextLong();
        sc.nextLine();
        System.out.print("Grade: ");
        String grade = sc.nextLine();

        Student student = new Student(name,id,grade);
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student,view);

        controller.getStudentDetails();

    }
}
