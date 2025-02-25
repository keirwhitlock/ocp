public class ByteMe {

    public static void main(String[] args) {

        System.out.println(
            String.format("Byte min: %d \t Byte max: %d", Byte.MIN_VALUE, Byte.MAX_VALUE)
        );

        System.out.println(
            String.format("Short min: %d \t Short max: %d", Short.MIN_VALUE, Short.MAX_VALUE)
        );

        // java will default literal whole numbers to an int
        long myLongValue = 100; // an int has been auto-cast to a long variable

        System.out.println(myLongValue);

        long myOtherLongValue = 100L; // append lower or uppper L (usually upper)
        System.out.println(myOtherLongValue);


        long myBigLiternal = 2_147_483_647; // auto casting the max int to a long is fine
        // long myBigLiternal2 = 2_147_483_647_999; // error: integer number too large

        /* Clearly the compiler wont allow the int to go beyond its max, even tho it can fit in a type of long */

        long myBigLiternal3 = 2_147_483_647_999L; // treating it as a long literal works fine.
    }
}