public class ForLoopsSake {

    public static void main(String... args) {


        // System.out.println("Calculating interest rates for £10,000");

        for(double i=2.0; i<=5.0; i++){
            double percentage = calculatePercentage(10_000.0, i);
            // System.out.printf("Rate is %.1f%% and the interest will be £%.2f\n", i, percentage);
        }

        System.out.println("Calculating interest rates for £100");
        for (double i=7.5; i<=10; i+=0.25){
            double percentage = calculatePercentage(100.0, i);
            System.out.printf("Rate is %.2f%% and the interest will be £%.2f\n", i, percentage);
        }
    }

    public static double calculatePercentage(double amount, double interestRate) {
        return(amount * (interestRate/100));
    }
}