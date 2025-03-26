import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("What is your Year of Birth? : ");

        String year = "0000";
        try {
            year = scanner.nextLine();
            scanner.close();

        } catch (NumberFormatException e) {
            System.out.println("Incorrect format! " + e);
        }

        int age = checkDate(2025, year);
        if (age == -1) {
            throw new NumberFormatException("Entered year was not acceptable.");
        }
        System.out.printf("You are %d years old!!\n", age);

    }

    public static int checkDate(int currentYear, String dateOfBirth) {

        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }

        return currentYear - dob;
    }
}