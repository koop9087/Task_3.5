import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        choice = choice.trim();
        System.out.println(choice.replaceAll("\\s+", " "));

    }
}

