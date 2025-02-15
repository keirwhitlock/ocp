public class Variables {

    /*
        fields and initialisers are initialised in order first
    */
    public static String classVar;

    { classVar = "initialiser"; }
    
    public String instanceVar;

    // var shouldntWork = "string";  // doesn't compile as var is a local inferance type

    /*
        then the constructor is initialised last
    */
    public Variables(){  // no rtn not even void, for constructor
        int localVarConstructor;
        instanceVar = "inside constructor";
        classVar = "override";
    }


    public static void main(String[] args) {
        System.out.println("Testing vars.");

        var localVar = "string type";

        String noValue; // if left and used, it will fail at compile - error: variable noValue might not have been initialized
        noValue = "init"; // fixes above ^

        Variables variables = new Variables();
        System.out.println(variables.classVar);
        System.out.println(noValue);
    }
}