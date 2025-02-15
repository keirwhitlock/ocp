// only 1 class per file can be public
public class TestClass {
    public static void main(String[] args) {
        // Add test code here


        Animal animal = new Animal();
        animal.setName("Bob");

        // Add any print statements here
        System.out.println("Hello world!");

        System.out.println(animal.getName());

        InputImports inputImports = new InputImports();
        // inputImports.read("./Zoo.java");
    }
}

/**
 * Javadoc multiple-line comment
 * @author Keir Whitlock <keir.whitlock@gmail.com>
 */
class Animal {
    
    /*
        members of the class
    */
    // fields & variables
    String name;


    // methods

    // public - signify that method may be called from other classes
    public String getName(){
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
}