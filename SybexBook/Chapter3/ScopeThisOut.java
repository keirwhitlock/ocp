public class ScopeThisOut {

    static void testFlowScoping() {

        Number number = 100;

        /*
        if (number instanceof Integer data || data.compareTo(5) > 0) {  // error: cannot find symbol
            System.out.println(data);
        }
        */

        if(!( number instanceof Integer data)) // returns if number isn't an instanceof Integer, therefore it is and data is assigned and in scope
            return;

        System.out.println(data.intValue()); // pattern variable must be in scope even outside of the if statement block

    }


    public static void main(String... args) {
        // System.out.println("Hello world");

        testFlowScoping();
    }
}