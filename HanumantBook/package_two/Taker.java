package package_two;

import package_one.Giver;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Taker {

    private static Logger lgr = Logger.getLogger("test.log");
    
    public static void main(String... args){

        lgr.info("Started fine...");
        lgr.log(Level.WARNING, "Help");

        Giver g = new Giver();

        g.setAge(30);
        System.out.println(g.getAge());

        System.out.println(Giver.name);

        Giver.name = "Ben";
        System.out.println(Giver.name);

        updateVar();
    }

    private static void updateVar(){
        int testInt = 0;

        for(int i=0; i<10; i++) {
            // int testInt = 10;
            testInt += i;
        }

        System.out.println(testInt);
    }
}
