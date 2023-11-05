package practice_1_8.practice_6.task_2;

public class Task_2 {
    public static void main(String[] args) {
        double temperature = 36.6;
        System.out.printf("Temperature:\n\t%.2f Celcius,\n\t%.2f Fahrenheit,\n\t%.2f  Kelvin.",
                temperature,
                (new CelciusToFahrenheit()).convert(temperature),
                (new CelciusToKelvin()).convert(temperature));
    }
}
