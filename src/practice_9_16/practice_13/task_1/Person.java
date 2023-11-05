package practice_9_16.practice_13.task_1;

public class Person {
    private final String surname;
    private final String name;
    private final String patronymic;

    public Person(String surname, String name, String patronymic){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getFullname(){
        StringBuilder fullname = new StringBuilder();
        if (surname != null){
            fullname.append(surname);
        }

        if (name != null){
            if (!fullname.isEmpty()){
                fullname.append(" ");
            }
            fullname.append(name);
        }

        if (patronymic != null){
            if (!fullname.isEmpty()){
                fullname.append(" ");
            }
            fullname.append(patronymic);
        }

        return fullname.toString();
    }
}
