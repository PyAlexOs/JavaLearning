package practice_17_24.practice_17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentView extends JFrame {
    private JPanel panel;
    private JButton addButton;
    private JButton searchButton;
    private JTextField studentData;
    private JScrollPane scrollPane;
    StudentView(){
        this.setTitle("Students");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        addHeader();

        scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.getContentPane().add(scrollPane);
        this.pack();
        this.setVisible(true);
    }

    private void addHeader(){
        searchButton = new JButton(new ImageIcon("files/magnifier.png"));
        addButton = new JButton(new ImageIcon("files/plus.png"));
        studentData = new JTextField(20);
        studentData.setFont(new Font("Times New Roman", Font.PLAIN, 16));

        JPanel mainPanel = new JPanel(new GridLayout(1, 3));
        mainPanel.add(studentData);
        mainPanel.add(addButton);
        mainPanel.add(searchButton);
        panel.add(mainPanel);

        JLabel idLabelH = new JLabel("id");
        JLabel nameLabelH = new JLabel("name");
        JLabel roleLabelH = new JLabel("role");
        JLabel deleteLabelH = new JLabel("delete");

        JPanel panelH = new JPanel(new GridLayout(1, 4));
        panelH.add(idLabelH);
        panelH.add(nameLabelH);
        panelH.add(roleLabelH);
        panelH.add(deleteLabelH);
        panel.add(panelH);
    }

    public void updateStudentsList(ArrayList<Student> students, ActionListener listener, int foundId){
        panel.removeAll();
        addHeader();

        if (students != null) {
            int i = 0;
            for (Student student : students) {
                JLabel idLabel = new JLabel(String.valueOf(student.getId()));
                JLabel nameLabel = new JLabel(student.getName());
                JLabel roleLabel = new JLabel(student.getRole() == null || student.getRole().isEmpty() ? "UNKNOWN" : student.getRole());
                JButton deleteButton = new JButton(new ImageIcon("files/trash.png"));
                deleteButton.addActionListener(listener);

                JPanel currentPanel = new JPanel(new GridLayout(1, 4));
                currentPanel.add(idLabel);
                currentPanel.add(nameLabel);
                currentPanel.add(roleLabel);
                currentPanel.add(deleteButton);
                if (i++ % 2 == 0) {
                    currentPanel.setBackground(Color.LIGHT_GRAY);
                }
                if (foundId == student.getId()){
                    currentPanel.setBackground(Color.YELLOW);
                }
                panel.add(currentPanel);
            }
        }
        panel.revalidate();
        panel.repaint();
        this.pack();
    }

    public void showMessage(String text){
        JOptionPane.showMessageDialog(this, text, "WARNING", JOptionPane.WARNING_MESSAGE);
    }

    public JButton getAddButton() {
        return this.addButton;
    }

    public JButton getSearchButton() {
        return this.searchButton;
    }

    public JTextField getStudentData() {
        return this.studentData;
    }
}
