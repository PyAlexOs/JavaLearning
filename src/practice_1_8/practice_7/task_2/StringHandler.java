package practice_1_8.practice_7.task_2;

public class StringHandler implements StringManip{
    @Override
    public int length(String str){
        return str.length();
    }

    @Override
    public String getOddChars(String str){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2){
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }

    @Override
    public String reverse(String str){
        return (new StringBuilder(str)).reverse().toString();
    }
}
