package practice_17_24.practice_17;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentController implements ActionListener{
    private static int searchOffset = 0;
    private static String lastSearch = "";
    private StudentModel model;
    private StudentView view;

    StudentController(StudentModel model, StudentView view){
        this.model = model;
        this.view = view;

        addListeners();
    }

    private void addListeners(){
        this.view.getAddButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = view.getStudentData().getText();
                if (name != null && !name.isEmpty()) {
                    String role = JOptionPane.showInputDialog("Enter student's role:");
                    model.addStudent(name, role);
                    updateList(-1);
                }
                else{
                    view.showMessage("Enter name first!");
                }
            }
        });

        this.view.getSearchButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = view.getStudentData().getText();
                view.getStudentData().setText(name);
                if (name != null && !name.isEmpty()) {
                    if (!lastSearch.equals(name)) {
                        searchOffset = -1;
                        lastSearch = name;
                    }

                    Student student = model.searchStudent(searchOffset, lastSearch);
                    if (!(student == null)) {
                        searchOffset = student.getId();
                    }
                    else{
                        if (searchOffset == -1) {
                            searchOffset = -1;
                            view.showMessage("Student " + name + " not found!");
                        }
                    }
                    updateList(searchOffset);

                }
                else{
                    view.showMessage("Enter name first!");
                }
            }
        });
    }

    private void updateList(int foundId){
        ArrayList<Student> students = model.getStudents();
        this.view.updateStudentsList(students, this, foundId);
        addListeners();
        if (foundId == -1){
            lastSearch = "";
            searchOffset = -1;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int deleteId = Integer.parseInt(((JLabel) ((JButton) e.getSource()).getParent().getComponent(0)).getText());
        model.eraseStudent(deleteId);
        updateList(-1);
    }
}
