package practice_9_16.practice_16.task_3;

import java.awt.*;

public class Task_3 {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                var App = new App();
                App.setVisible(true);
            }
        });
    }
}
