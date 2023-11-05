package practice_1_8.practice_4_1.task_2;

public class Main {
    public static void main(String[] args) {
        Reader[] readers = new Reader[5];
        readers[0] = new Reader(1, "Иванов Иван Иванович", new int[]{9, 3, 1988},
                "8-(800)-555-35-35", "Program Engineering");
        readers[1] = new Reader(2, "Костин Петр Ильич", new int[]{29, 8, 2003},
                "8-(567)-787-43-52", "IoT");
        readers[2] = new Reader(3, "Вдовяков Валерий Александрович", new int[]{6, 24, 2002},
                "8-(453)-222-23-23", "AI");
        readers[3] = new Reader(4, "Рудиков Илья Михайлович", new int[]{27, 9, 2004},
                "8-(246)-333-22-46", "Program Engineering");
        readers[4] = new Reader(5, "Суховилов Павел Павлович", new int[]{7, 7, 2004},
                "8-(567)-444-78-90", "Program Engineering");

        Book[] books = new Book[3];
        books[0] = new Book("Иван Царевич и Серый Волк", "Народные");
        books[1] = new Book("Маленький Принц", "Де Сент-Экзюпери");
        books[2] = new Book("Энциклопедия", "Научное издательство");

        readers[0].takeBook(10);
        readers[1].takeBook(new String[] {books[0].getName(),books[2].getName()});
        readers[2].returnBook(new Book[] {books[2]});
        readers[3].returnBook(new String[] {books[0].getName()});
        readers[4].takeBook(new Book[] {books[1]});
        readers[1].returnBook(10);
    }
}
