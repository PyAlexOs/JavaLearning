package practice_9_16.practice_13.task_2;

public class Task_2 {
    public static void main(String[] args) {
        String[] numbers = {
                "+79175655655",
                "+104289652211",
                "89175655655"
        };

        for (String number : numbers){
            System.out.println(PhoneNumber.convert(number));
        }
    }
}
