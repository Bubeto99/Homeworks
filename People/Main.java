import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static PeopleRepository repository = new PeopleRepository();

    public static void main(String[] args) {

        while(true) {
            System.out.println("1. Add Student");
            System.out.println("2. Add Professor");
            System.out.println("3. Add rich student");
            System.out.println("4. Show stats");
            System.out.println("5. Increase stats");

            var input = scanner.nextLine();

            switch (input) {
                case "1":
                    repository.addStudent(100);
                    break;
                case "2":
                    repository.addProfessor(50);
                    break;
                case "3":
                    repository.addRichStudent(20);
                    break;
                case "4":
                    ShowStats();
                    break;
                case "5":
                    increaseStats();
            }
        }
    }

    private static void increaseStats() {
        System.out.println("Stats Increased");
        repository.increaseStats();
    }

    private static void ShowStats() {
    }
}
