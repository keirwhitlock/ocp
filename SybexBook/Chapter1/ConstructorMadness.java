public class ConstructorMadness {

    String name;

    public void ConstructorMadness(){  // prints null below as void rtn type is not a constructor
        this.name = "bob";
    }

    // adding correct constructor
    public ConstructorMadness(){
        this.name = "bill";  // now prints bill, as method signature is correct for a constructor
    }

    public static void main(String... args) {

        ConstructorMadness cm = new ConstructorMadness();
        System.out.println(cm.name);
    }
}