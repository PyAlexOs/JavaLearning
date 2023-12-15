package practice_17_24.practice_24.task_1;

public class MagicalChair implements Chair {
    public void doMagic(){
        System.out.println("WWWWZZZZUUUUUUUUUUUUUUHHH");
    }
    @Override
    public void sit() {
        System.out.println("Magical chair");
    }
}
