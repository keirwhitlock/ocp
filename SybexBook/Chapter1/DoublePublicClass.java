public class DoublePublicClass {

    public static void main(String args[]){
        System.out.println("Hello world");
    }
}

public class SecondPublicClass {  // compile error, cannot have 2 public classes in same file

    public static String myFunc(){
        return "Hello world";
    }
}