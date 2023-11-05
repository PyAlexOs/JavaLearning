package practice_1_8.practice_6.task_2;

public class CelciusToFahrenheit implements Convertable{
    @Override
    public double convert(double temperature){
        return (temperature * 9 / 5) + 32;
    }
}
