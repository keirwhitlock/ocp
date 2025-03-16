import java.util.Scanner;

public class Numbers {

    public static void main(String... args){

        try (var in = new Scanner(System.in);) {
            int num = in.nextInt();
            
            System.out.printf("\n\n");
            System.out.printf("Binary %s\n", Integer.toString(num, 2));
            System.out.printf("Octal %o\n", num);
            System.out.printf("Hex %x\n", num);
        }
    
    }
}