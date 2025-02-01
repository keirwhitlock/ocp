import java.util.Optional;

public class AverageScores {


    // Optional relies on a factory pattern & does not expose any public constructors
    public static Optional<Double> average(int... scores){
        
        if(scores.length == 0) return Optional.empty();
            int sum = 0;
            for(int score: scores) sum += score;
            return Optional.of((double) sum / scores.length);
    }


    public static void main(String[] args){

        /*
        Optional<Double> opt = average(1,2,3,4,5,6,7);
        System.out.println(opt.isEmpty());

        System.out.println(average());
        System.out.println(average(1,2));
        */

        Optional<Double> opt = average(90, 100);
        if (opt.isPresent())
            System.out.println(opt.get()); // 95.0


        // ofNullable() - factory method java provides to cater for (value == null) ? Optional.empty() : Optional.of(value);
        Optional o = Optional.ofNullable(null);
        System.out.println(o);


        // Dealing with an Empty Optional p557
        System.out.println(o.orElse(Double.NaN));
        System.out.println(o.orElseGet(() -> Math.random()));

        // have the code throw an `java.util.NoSuchElementException` exception if the Optional is empty
        System.out.println(o.orElseThrow());


    }
}
