public class PrimeTime {

    public static void main(String... args) {

        int counter = 0;
        
        for(int i=50; i<=1000; i++){
            if(isPrime(i)){
                counter++;
                System.out.println(i);
                if(counter == 30) {
                    break;
                }
            }
        }

        System.out.printf("There are %d prime numbers\n", counter);

    }

    public static boolean isPrime(int wholeNumber) {

        if(wholeNumber <= 2){
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++){
            if(wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}