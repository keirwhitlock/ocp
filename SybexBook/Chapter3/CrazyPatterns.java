public class CrazyPatterns {


    public static void main(String[] args) {

        /*
        System.out.println("Hello world");

        boolean a = false;

        if(a) System.out.println("Inside statement");
            System.out.println("Outside statement"); // if statement without {} block acts on 1 statement that follows.

        if(!a)
            System.out.println("Inside statement");
            System.out.println("Outside statement"); // if statement without {} block acts on 1 statement that follows.

        */

        Number v = 10;

        if(v instanceof Integer vAsInteger) {
            System.out.println("number is instanceof Integer");
            
            System.out.println(vAsInteger.intValue());
        }

        if(v instanceof Integer data && data.intValue() > 5) {
            System.out.println(data.doubleValue());
        }
    }
}