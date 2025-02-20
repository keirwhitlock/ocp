import java.util.Arrays;

public class GoCompare {

    public static void main(String[] args) {
        // == for comparing objects vs equals() for comparing content

        System.out.println(new int[] {1} == new int[] {1}); // should be false as they are diff objects (2 news)
        System.out.println(Arrays.equals(new int[] {1}, new int[] {1})); // should be true as the content is same

        String var1[] = new String[] {"Hello", "world"};
        String[] var2 = var1;

        System.out.println(var1 == var2); // should be true

        // compare() p197

        System.out.println(Arrays.compare(new int[] {1}, new int[] {2}));  // -1 as left is smaller than right
        System.out.println(Arrays.compare(new int[] {2}, new int[] {1}));  // (pos) 1 as right is smaller than left
        System.out.println(Arrays.compare(new int[] {2}, new int[] {2}));  // 0 equal / balanced

        // System.out.println(Arrays.compare(new int[] {1}, new String[] {"hi"}));  // doesn't compile as arrays are diff types

        // mismatch() p198

        System.out.println(Arrays.mismatch(new int[] {1}, new int[] {1})); // -1 as both are the same
        System.out.println(Arrays.mismatch(new int[] {1}, new int[] {1, 2})); 
    }
}