package practice_9_16.practice_11.task_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Student {
    private String name;
    private LocalDate birthDate;

    public Student(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return name + " " + formatDate(birthDate, "dd.MM.yyyy");
    }

    public String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}