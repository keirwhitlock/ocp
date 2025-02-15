public class ValvVars {

    public static void main(String... args) {


        /*
            Compile fine
        */
        byte hat = 1;
        byte gloves = 7 * 10;

        short scarf = 5;
        short boots = 2 + 1;

        /* 
            error: incompatible types: possible lossy conversion from int to short
        */
        // boots = 2 + hat; // both operands get converted to int
        // byte gloves = 7 * 100; // (700) max byte 127

        // fix boots by casting whole statement from converted int to short
        boots = (short)(2 + hat); 
    }
}