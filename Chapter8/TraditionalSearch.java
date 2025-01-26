import java.util.*;
public class TraditionalSearch {
    public static void main(String[] args) {

        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangeroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        print(animals, new CheckIfHopper());
    }

    private static void print(List<Animal> animals, CheckTrait checker){
        for (Animal animal : animals){

            if(checker.test(animal))
                System.out.print(animal + " ");

        }

        System.out.println();
    }
}
