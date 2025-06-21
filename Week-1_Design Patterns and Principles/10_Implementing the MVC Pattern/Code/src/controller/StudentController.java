package controller;

import model.Student;
import view.StudentView;

public class StudentController {
    private Student student;
    private StudentView view;

    public StudentController(Student student,StudentView view){
        this.student = student;
        this.view = view;
    }

    public String getStudentName(){
        return student.getName();
    }

    public void setStudentName(String name){
        student.setName(name);
    }

    public long getStudentId(){
        return student.getId();
    }
    public void setStudentId(long id){
        student.setId(id);
    }

    public String getStudentGrade(){
        return student.getGrade();
    }
    public void setStudentGrade(String grade){
        student.setGrade(grade);
    }

    public void getStudentDetails(){
        view.displayStudentDetails(student);
    }
}
