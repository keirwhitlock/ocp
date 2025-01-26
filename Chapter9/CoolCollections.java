import java.util.*;

public class CoolCollections {


    public static void main(String[] args) {
        List numbers = new ArrayList(List.of(1, 3, 3));
        System.out.println(numbers);

        // generics to define a parameterized type
        List<Integer> numbers2 = new ArrayList<Integer>(List.of(1,2,3));
        Integer element = numbers2.get(0);
        System.out.println(element);

        // shortening generics
        // via diamond operator
        
        // <> operator on right side, taking context from <Integer>
        List<Integer> list = new ArrayList<>();

        // via var
        // var on lest side, taking context from <Integer>
        var list2 = new ArrayList<Integer>();


        System.out.println(list2.add(1));
        
        Collection<String> set = new HashSet<>();
        System.out.println(set.add("Sparrow")); // set is a collection that doesn't allow duplicates
        System.out.println(set.add("Sparrow")); // so the second add statement shouldn't result in `false`
                                                

        System.out.println(set.remove("Sparrow"));
        System.out.println(set.remove("Sparrow"));
    }
}
