package practice_9_16.practice_16.task_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    private JTextArea textArea;

    public App() {
        this.setTitle("Text redaction");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.createMenu();

        textArea = new JTextArea();
        this.getContentPane().add(new JScrollPane(textArea));
    }

    private void createMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu colorMenu = new JMenu("Colour");
        JMenuItem blueMenuItem = new JMenuItem("Blue");
        JMenuItem redMenuItem = new JMenuItem("Red");
        JMenuItem blackMenuItem = new JMenuItem("Black");

        blueMenuItem.addActionListener(new ColorMenuItemListener(Color.BLUE));
        redMenuItem.addActionListener(new ColorMenuItemListener(Color.RED));
        blackMenuItem.addActionListener(new ColorMenuItemListener(Color.BLACK));

        colorMenu.add(blueMenuItem);
        colorMenu.add(redMenuItem);
        colorMenu.add(blackMenuItem);

        JMenu fontMenu = new JMenu("Font");
        JMenuItem timesNewRomanMenuItem = new JMenuItem("Times New Roman");
        JMenuItem msSansSerifMenuItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierNewMenuItem = new JMenuItem("Courier New");

        timesNewRomanMenuItem.addActionListener(new FontMenuItemListener("Times New Roman"));
        msSansSerifMenuItem.addActionListener(new FontMenuItemListener("MS Sans Serif"));
        courierNewMenuItem.addActionListener(new FontMenuItemListener("Courier New"));

        fontMenu.add(timesNewRomanMenuItem);
        fontMenu.add(msSansSerifMenuItem);
        fontMenu.add(courierNewMenuItem);

        JMenu sizeMenu = new JMenu("Size");
        for (int i = 0; i < 20; i += 2) {
            int size = 8 + i;
            JMenuItem sizeMenuItem = new JMenuItem(String.valueOf(size));
            sizeMenuItem.addActionListener(new SizeMenuItemListener(size));
            sizeMenu.add(sizeMenuItem);
        }

        menuBar.add(colorMenu);
        menuBar.add(fontMenu);
        menuBar.add(sizeMenu);

        setJMenuBar(menuBar);
    }

    private class ColorMenuItemListener implements ActionListener {
        private Color colour;

        public ColorMenuItemListener(Color colour) {
            this.colour = colour;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setForeground(colour);
        }
    }

    private class FontMenuItemListener implements ActionListener {
        private String font;

        public FontMenuItemListener(String font) {
            this.font = font;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setFont(new Font(font, textArea.getFont().getStyle(), textArea.getFont().getSize()));
        }
    }

    private class SizeMenuItemListener implements ActionListener {
        private int size;

        public SizeMenuItemListener(int size) {
            this.size = size;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setFont(new Font(textArea.getFont().getName(), textArea.getFont().getStyle(), size));
        }
    }
}
