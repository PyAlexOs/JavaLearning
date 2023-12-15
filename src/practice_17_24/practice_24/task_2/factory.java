package practice_17_24.practice_24.task_2;

import java.util.Objects;

public class factory {
    public static Document getDocument(String type, String access){
        if (Objects.equals(type, "text")) {
            if (Objects.equals(access, "o")) {
                return new CreateTextDocument().createOpen();
            }
            else{
                return new CreateTextDocument().createNew();
            }
        }
        else if (Objects.equals(type, "image")) {
            if (Objects.equals(access, "o")) {
                return new CreateImageDocument().createOpen();
            }
            else{
                return new CreateImageDocument().createNew();
            }
        }
        else if (Objects.equals(type, "music")) {
            if (Objects.equals(access, "o")) {
                return new CreateMusicDocument().createOpen();
            }
            else{
                return new CreateMusicDocument().createNew();
            }
        }
        return null;
    }
}
