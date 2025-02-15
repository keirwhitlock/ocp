public class InstanceInit {

    private String name = "Fluffy";

    { System.out.println("Inside 'Instance Initialiser' - " + name); 
      name = "Susan";  
    } // needs semi-colon

    { System.out.println("Second II - " + name ); }

    public InstanceInit(){
        name = "Tiny";
        System.out.println("Inside 'Constructor' - " + name);
    }

    public static void main(String... args) {
        InstanceInit ii = new InstanceInit();
        ii.name = "Ben";
        System.out.println("Inside 'main' - " + ii.name);
    }
}