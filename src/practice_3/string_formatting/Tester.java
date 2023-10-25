package practice_3.string_formatting;

public class Tester {
    public static void main(String[] args) {
        Agency agency = new Agency("Sber");
        agency.addEmpoyee("Иванов Иван Иванович", 0);
        agency.addEmpoyee("Костин Петр Ильич", 250_000);
        agency.addEmpoyee("Вдовяков Валерий Александрович", 100_000);
        Report.generateReport(agency);
    }
}
