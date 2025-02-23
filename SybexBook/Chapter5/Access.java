public class Access {

    public static void main(String... args){
        Supplier.skip1();
        //Supplier.skip2();  // method is private so cant be reached.
        Supplier.skip3();
        Supplier.skip4();
    }
}