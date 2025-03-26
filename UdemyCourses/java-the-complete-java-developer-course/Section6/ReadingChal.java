import java.util.Scanner;

public class ReadingChal {

    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        while (count < 6) {

            System.out.println("Enter number #" + count);
            String choice = scanner.nextLine();

            try {
                int i = Integer.parseInt(choice);
                count++;
                sum += i;
            } catch (Exception e) {
                System.out.println("Invalid number");
            }
        }
        System.out.println("Sum is: " + sum);
        scanner.close();
    }
}