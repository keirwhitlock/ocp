import java.util.Scanner;
import java.lang.Math;

public class Largest {

    public static void main(String... args){

        // conditional operator 
        // condition ? true : false;

        try(var in = new Scanner(System.in)){
            int var1 = in.nextInt();
            int var2 = in.nextInt();
            int var3 = in.nextInt();

            int highScore = 0;

            /*
                highScore = var1 > var2 ? var1 : var2;
                highScore = var1 > var3 ? var1 : var3;
            */

            highScore = Math.max(var1, var2);
            highScore = Math.max(var1,var3);
            
 
            System.out.printf("The largest of the 3 ints was: %d\n",highScore);

        }

    }
}