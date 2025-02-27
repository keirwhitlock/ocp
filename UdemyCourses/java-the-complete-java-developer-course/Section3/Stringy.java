public class Stringy {

    public static void main(String... args) {

        System.out.println("Hello" + " world");
        System.out.println(1 + 5 + " world"); // from left to right, the addition operates first, then concat 6 with the string.
        System.out.println("world " + 1 + 5); // now the string is concat with 1 (as a string) and 5 giving "world 15"
    }
}