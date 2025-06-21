package view;

import model.Student;

public class StudentView {
    public void displayStudentDetails(Student student){
        System.out.println("Displaying student details:");
        System.out.println("Student name: "+ student.getName());
        System.out.println("Student id: "+ student.getId());
        System.out.println("Student grade: "+ student.getGrade());
    }
}
