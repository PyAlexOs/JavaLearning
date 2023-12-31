package practice_1_8.practice_2.task_4;

public class Computer {
    private String model;
    private short rate;

    public Computer(String model) {
        this.model = model;
        rate = 0;
    }

    public String getModel() {
        return model;
    }

    public short getRate() {
        return rate;
    }

    public void setRate(short rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "model='" + model + '\'' +
                ", rate=" + rate +
                "%}";
    }
}
