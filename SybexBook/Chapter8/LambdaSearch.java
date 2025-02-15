import java.util.*;

public class LambdaSearch {
    public static void main(String[] args){
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangeroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        // print(animals, new CheckIfHopper());
        print(animals, a -> a.canHop());

        /* the lambda expression `a -> a.canHop()` is used in place of
         * instantiating a new CheckIfHopper instance.
         */

    }

    public static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals ){
            if (checker.test(animal))
                    System.out.print(animal + " ");
        }

        System.out.println();
    }
}
