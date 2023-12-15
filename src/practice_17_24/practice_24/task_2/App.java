package practice_17_24.practice_24.task_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        newMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateDocument documentFactory = new CreateTextDocument();
                Document document = documentFactory.createNew();
                document.open();
            }
        });
        fileMenu.add(newMenuItem);

        JMenuItem openMenuItem = new JMenuItem("Open");
        openMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateDocument documentFactory = new CreateTextDocument();
                Document document = documentFactory.createOpen();
                document.open();
            }
        });
        fileMenu.add(openMenuItem);

        // Пункт меню "Save"
        JMenuItem saveMenuItem = new JMenuItem("Save");
        saveMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateDocument documentFactory = new CreateTextDocument();
                Document document = documentFactory.createOpen();
                document.save();
            }
        });
        fileMenu.add(saveMenuItem);

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        fileMenu.add(exitMenuItem);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}