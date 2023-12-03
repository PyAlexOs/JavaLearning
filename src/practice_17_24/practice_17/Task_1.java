package practice_17_24.practice_17;

import java.awt.*;

public class Task_1 {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                var controller = new StudentController(new StudentModel(), new StudentView());
            }
        });
    }
}
