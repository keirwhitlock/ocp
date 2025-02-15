public class NumberFmt {

    static int myDec = 1234; // no prefix
    static int myOct = 017;  // octal has a : 0 prefix
    static int myHex = 0xff; // hex has a : 0x prefix
    static int myBin = 0b10; // binary has a : 0b prefix

    public static void main(String[] args) {

        System.out.println("decimal : " + myDec);
        System.out.println("octal : " + myOct);
        System.out.println("hex : " + myHex);
        System.out.println("binary : " + myBin);
    }
}