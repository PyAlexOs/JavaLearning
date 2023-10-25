package practice_1;

public class Task_5 {
    public static void main(String[] args){
        if (args.length == 0){
            System.out.println("Try to run this code in the Terminal with some args.");
            System.exit(0);
        }

        for (String arg : args) {
            System.out.print(arg + "\n");
        }
    }
}
