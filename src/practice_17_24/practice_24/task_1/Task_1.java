package practice_17_24.practice_24.task_1;

public class Task_1 {
    public static void main(String[] args) {
        Client client1 = new Client();
        Client client2 = new Client();
        Client client3 = new Client();

        Chair chair1 = ChairFactory.getChair(new VictorianChairFactory());
        ((VictorianChair) chair1).setAge(100);
        Chair chair2 = ChairFactory.getChair(new MagicalChairFactory());
        Chair chair3 = ChairFactory.getChair(new MultifunctionalChairFactory());

        client1.setChair(chair1);
        client2.setChair(chair2);
        client3.setChair(chair3);

        client1.sit();
        client2.sit();
        client3.sit();
    }
}
