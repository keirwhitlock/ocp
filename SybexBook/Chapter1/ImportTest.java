import java.util.*;  // single wildcard import works
// import java.util.Date; // more specific import makes wildcard redundant (in this case)
import java.sql.Date; // conflict, compiler doesn't know what one to choose.

public class ImportTest {

    static java.util.Date date;  // with no imports - error: cannot find symbol
    // with FQN the sql import doesn't clash


    public static void main(String... args){
        System.out.println("hello world " + date);
    }
}