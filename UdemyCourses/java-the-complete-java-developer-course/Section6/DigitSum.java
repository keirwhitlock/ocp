public class DigitSum {

    public static void main(String... args) {
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(-123));
        System.out.println(sumDigits(9));
        System.out.println(sumDigits(1234));
    }

    public static int sumDigits(int number) {

        if(number < 0) {
            return -1;
        }

        int total = 0;
        while(number != 0) {
            total += number % 10;
            number /= 10;
        }

        return total;
    }
}