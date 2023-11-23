package practice_9_16.practice_16.task_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static javax.swing.SwingConstants.CENTER;

public class App extends JFrame implements MouseListener {
    private JTextField textField;
    private JPanel panel;
    private JButton button;
    private int randomNumber;
    private int attempts;

    public App() {
        this.setTitle("Guess Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLayout(new BorderLayout());

        textField = new JTextField(10);
        textField.setHorizontalAlignment(CENTER);
        button = new JButton("Try");
        button.addMouseListener(this);

        JPanel centerPanel = new JPanel(new FlowLayout());
        centerPanel.setBackground(Color.CYAN);
        centerPanel.addMouseListener(this);
        centerPanel.add(textField);
        centerPanel.add(button);

        JPanel westPanel = new JPanel();
        westPanel.setBackground(Color.MAGENTA);
        westPanel.addMouseListener(this);

        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.YELLOW);
        southPanel.addMouseListener(this);

        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.GREEN);
        northPanel.addMouseListener(this);

        JPanel eastPanel = new JPanel();
        eastPanel.setBackground(Color.ORANGE);
        eastPanel.addMouseListener(this);

        panel = new JPanel(new BorderLayout());
        panel.add(centerPanel, BorderLayout.CENTER);
        panel.add(westPanel, BorderLayout.WEST);
        panel.add(eastPanel, BorderLayout.EAST);
        panel.add(northPanel, BorderLayout.NORTH);
        panel.add(southPanel, BorderLayout.SOUTH);

        this.add(panel);
        this.setVisible(true);

        randomNumber = (int) (Math.random() * 21);
    }

    public void checkGuess() {
        int guess = Integer.parseInt(textField.getText());
        if (guess == randomNumber) {
            JOptionPane.showMessageDialog(this, "Yes, the number is " + guess);
            System.exit(0);
        } else if (guess < randomNumber) {
            JOptionPane.showMessageDialog(this, "The number is bigger.");
        } else {
            JOptionPane.showMessageDialog(this, "The number is smaller.");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getComponent() == button) {
            int guess;
            try {
                guess = Integer.parseInt(textField.getText());
            }
            catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(this, "Incorrect input.");
                return;
            }

            if (guess == randomNumber) {
                JOptionPane.showMessageDialog(this, "You answered right!");
                System.exit(0);
            }
            else if (++attempts >= 3) {
                JOptionPane.showMessageDialog(this, "Oh, incorrect number again...\n" +
                        "You have no more attempts.", "Game over", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
            else if (guess < randomNumber) {
                JOptionPane.showMessageDialog(this, "Number is bigger.");
            }
            else {
                JOptionPane.showMessageDialog(this, "Number is smaller.");
            }
        }
    }

    public void mouseEntered(MouseEvent e) {
        if (e.getComponent().getBackground() == Color.CYAN) {
            JOptionPane.showMessageDialog(null, "Добро пожаловать в ЦАО!");
        } else if (e.getComponent().getBackground() == Color.MAGENTA) {
            JOptionPane.showMessageDialog(null, "Добро пожаловать в ЗАО!");
        } else if (e.getComponent().getBackground() == Color.YELLOW) {
            JOptionPane.showMessageDialog(null, "Добро пожаловать в ЮАО!");
        } else if (e.getComponent().getBackground() == Color.GREEN) {
            JOptionPane.showMessageDialog(null, "Добро пожаловать в САО!");
        } else if (e.getComponent().getBackground() == Color.ORANGE) {
            JOptionPane.showMessageDialog(null, "Добро пожаловать в ВАО!");
        }
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}