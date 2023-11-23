package practice_9_16.practice_16.task_1;

import java.awt.EventQueue;

public class Task_1 {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                var App = new App();
                App.setVisible(true);
            }
        });
    }
}
