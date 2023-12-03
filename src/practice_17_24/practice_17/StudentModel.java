package practice_17_24.practice_17;

import java.util.ArrayList;
import java.util.Objects;

public class StudentModel {
    private ArrayList<Student> students;
    StudentModel(){
        this.students = new ArrayList<>();
    }
    
    public void addStudent(String name, String role){
        students.add(new Student(role, name));
    }

    public void eraseStudent(int id){
        for (Student student : students){
            if (student.getId() == id){
                students.remove(student);
                break;
            }
        }
    }

    public Student searchStudent(int offsetId, String name){
        boolean status = offsetId == -1;

        for (Student student : students){
            if (status && Objects.equals(student.getName(), name)){
                return student;
            }
            if (student.getId() == offsetId){
                status = true;
            }
        }
        return null;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
