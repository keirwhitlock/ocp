public class SumOdd{

    public static void main(String... args) {
        sumOdd(1, 11);
    }

    public static boolean isOdd(int number){
        
        if(number < 1 || (number % 2 == 0)){
            return false;
        }
        
        return true;
        
    }
    
    public static int sumOdd(int start, int end) {
        System.out.println("Start " + start);
        System.out.println("End " + end);
        int sum = 0;
        
        if(start < 0 || end < 0 || end < start) {
            return -1;
        }
        
        for(int i = start; i <= end; i++) {
            if(isOdd(i)){
                System.out.println("Number is " + i);
                sum += i;
                System.out.println("Sum is " + sum);
            }
        }
        
        return sum;
    }
}