package practice_17_24.practice_21.task_2;

public class Task_2 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3};
        Double initialValue = 4.5;
        String[] toAdd= {"str1", "str2", "str3"};

        universalArray<Integer> firstArray = new universalArray<>(array);
        universalArray<Double> secondArray = new universalArray<>(3, initialValue);
        universalArray<String> thirdArray = new universalArray<>(1);

        for (String str : toAdd){
            thirdArray.add(str);
        }

        System.out.println(firstArray);
        System.out.println(secondArray);
        System.out.println(thirdArray);

        System.out.println("firstArray 1-st element accessing by index 0: " + firstArray.At(0));
        System.out.println("firstArray 2-nd element accessing by index -2: " + firstArray.At(-2));
        System.out.println("thirdArray 3-d element accessing by index -1: " + firstArray.At(-1));
    }
}
