import java.util.*;
import java.util.stream.*;

public class Bingo {

    public static void main(String[] args) {
        
        List<String> bingoPool = new ArrayList<>(75);

        int start = 1;

        for(char c : "BINGO".toCharArray()) {
            for (int i = start; i < (start + 15); i++) {
                // 
                bingoPool.add("" + c + i);
                //System.out.println("" + c + i);
            }
            start += 15;
        }

        // shuffle the list of bingo balls, and print out the first
        // 15 balls, with a seperator.
        Collections.shuffle(bingoPool);
        for (int i = 0 ; i < 15; i++){
            System.out.println(bingoPool.get(i));
        }
        System.out.println("------------------");

        /*
         * imperative method
         */

        // create a new list from a subList; sort it, and if the first
        // char is G or O, insert a - between the first and rest of the 
        // chars
        // List<String> firstOnes = bingoPool.subList(0, 15);
        // ^^^ Reminder, subList returns a view, which can alter the
        // original list
        List<String> firstOnes = new ArrayList<>(bingoPool.subList(0, 15));
        firstOnes.sort(Comparator.naturalOrder());
        firstOnes.replaceAll(s -> {
            if (s.indexOf('G') == 0 || s.indexOf('O') == 0) {
                String updated = s.charAt(0) + "-" + s.substring(1);
                System.out.print(updated + " ");
                return updated;
            }
            return s;
        });
        System.out.println("\n------------------------");

        /*
         * using streams
         */

        bingoPool.stream()
            .limit(15)
            .filter(s -> s.indexOf("G") == 0 || s.indexOf("O") == 0)
            .map(s -> s.charAt(0) + "-" + s.substring(1))
            .sorted()
            .forEach(s -> System.out.print(s + " "));
    }

}
