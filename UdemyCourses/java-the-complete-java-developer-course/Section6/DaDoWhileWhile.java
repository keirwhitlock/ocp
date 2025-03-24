public class DaDoWhileWhile {

    public static void main(String args[]) {
        
        int odds = 0;
        int evens = 0;

        int i = 5;
        while(i <= 20) {
            if(isEvenNumber(i)) {
                System.out.printf("%d is EVEN\n", i);
                evens++;

                if(evens >= 5) {
                    break;
                }

            } else {
                odds++;
            }
            i++;
        }
        System.out.printf("\n\nOdds: %d\nEvens: %d\n", odds, evens);
    }

    public static boolean isEvenNumber(int number) {
        return (number % 2 == 0);
    }
}