import java.util.Scanner;

public class MadMinMax {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;

        while (true) {
            System.out.println("Enter a number, or any other character to quit.");
            String character = scanner.nextLine();

            try {
                int number = Integer.parseInt(character);
                if (min == 0 || number < min) {
                    min = number;
                }

                if (number > max) {
                    max = number;
                }
            } catch (Exception e) {
                System.out.printf("New min: %d\nNew max: %d\n\n", min, max);
                break;
            }

        }

        scanner.close();

    }

}