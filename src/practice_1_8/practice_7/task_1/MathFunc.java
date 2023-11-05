package practice_1_8.practice_7.task_1;

public class MathFunc implements MathCalculable{
    @Override
    public double pow(double base, double e){
        return Math.pow(base, e);
    }

    @Override
    public double mod(double real, double i){
        return Math.sqrt(Math.pow(real, 2) + Math.pow(i, 2));
    }
}
