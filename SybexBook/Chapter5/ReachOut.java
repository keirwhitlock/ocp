public class ReachOut {

    static String hike(int a) {
        if(1 < 2) { // even tho always true, the compiler will not compile
            return "Orange"; 
        }

        // needs another return stmt outside the if block
    }

    public static void main(String[] args) {
        String v = hike(1);
    }
}