public class Chario {

    public static void main(String... args) {

        char myChar = 'D';  // single quotes
        // char myChar2 = "D"; // Cant use double quotes for char. error: incompatible types: String cannot be converted to char


        //char myChar2 = 'DD'; //error: unclosed character literal

        // https://symbl.cc/

        char mySimpleChar = '?';
        char myUnicodeChar = '\u003f';
        char myDecimalChar = 63;

        System.out.println(String.format("Simple: %s, Unicode: %s, Decimal: %s", mySimpleChar, myUnicodeChar, myDecimalChar));
    }
}