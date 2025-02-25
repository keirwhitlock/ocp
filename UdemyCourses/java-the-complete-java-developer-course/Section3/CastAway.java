public class CastAway {

    public static void main(String... args) {

        short myShort = Short.MIN_VALUE; int myInt = Integer.MAX_VALUE; // same line is fine for diff type IF semi-colon used.
        byte myByte1 = Byte.MIN_VALUE, myByte2 = Byte.MAX_VALUE; // same type can be declared with a colon, note only one type name

        // String myString = "Billy", myFloat = 0.00; // wont compile
        // String myString = "Billy", double myFloat = 0.0; // wont compile
        // String myString = "Billy", String myString2 = "Bob"; // wont compile



        /* expression wont compile as the default whole number in Java is an int
        so you will need to cast it */
        // byte myNewByte = (myByte1 / 2);

        /* if we cast it, weve told the compiler to treat the result of the expression as a byte */
        byte myNewByte = (byte)(myByte1 / 2);

        // double is java's default real number type
        float myCastedFloat = (float) 5.25;
        float mySuffixFloat = 5.25F;
    }
}