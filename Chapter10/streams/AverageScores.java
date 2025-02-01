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


    }
}
