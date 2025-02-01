import java.util.Optional;

public class ManyOptions {
    /*
     * Common Optional instance methods
     * Sybex @ page 556
     */

    /*
     * get() interface method. throws an exception if Optional is empty, else returns the value
     *
     */
    public static void getOptional() {
        Optional<Integer> i = Optional.of(Integer.valueOf(1));
        System.out.println(i.get());
    }

    /*
     * ifPresent(Consumer c) - does nothing if Optional is empty, else calls consumer with the value
     */
    public static void ifPresentOptional() {
        Optional<Double> opt = Optional.of(15.5);
        opt.ifPresent(System.out::println); // 15.5

        Optional<Double> opt3 = Optional.empty();
        opt3.ifPresent(System.out::println);
        
        // Optional<Double> opt2 = null;
        // opt2.ifPresent(System.out::println); // exception
    }

    /* 
     * isPresent() - returns false if empty, else returns true <Boolean>
     */
    public static void isPresentOptional() {
        Optional<Double> opt = Optional.of(12.3);
        System.out.println(opt.isPresent()); // true

        Optional<Double> emptyOpt = Optional.empty();
        System.out.println(emptyOpt.isPresent()); // false
    }

    public static void main(String[] args) {
        getOptional();
        ifPresentOptional();
        isPresentOptional();
    }
}
