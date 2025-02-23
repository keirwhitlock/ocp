public class Supplier{

    public static void skip1() {
        System.out.println("hi");
    };

    private static void skip2() { // same class 
        System.out.println("hi");
    };

    protected static void skip3() { // same package or sub-class
        System.out.println("hi");
    };

    static void skip4() {
        System.out.println("hi");
    };

}