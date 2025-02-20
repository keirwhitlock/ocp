import java.util.Arrays;

public class ArraysForToday {

    public static void main(String args[]){
        
        // position of the [] is fine anywhere after the type
        String[] animals;
        String [] animals2;
        String []animals3;
        String animals4[];
        String animals5      [];


        // because of where the [] are, were creating two int types, but ids is an int[] where as types is just int.
        int ids[], types;

        // ids is of type int[] but doesn't point to anything initialised yet.
        ids = new int[2];
        types = 10;

        System.out.println(ids[0]);
        System.out.println(types);

        System.out.println(ids.length); // notice length isn't a method, thus no ()

        // sorting arrays

        int[] sorted = {10,4,6,8,5,9,1,2,7};

        System.out.println(Arrays.toString(sorted)); // notice the toString() method is a static method from the Arrays class, not the int[] type

        Arrays.sort(sorted);

        System.out.println(Arrays.toString(sorted));
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(String.format("Inx %d - %d", i, sorted[i]));
        }

        // searching NB: requires a sorted array first, like above ^
        System.out.println(Arrays.binarySearch(sorted, 5)); 
        System.out.println(Arrays.binarySearch(sorted, 0)); 
        System.out.println(Arrays.binarySearch(sorted, 3)); 

    }
}