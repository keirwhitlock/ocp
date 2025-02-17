public class SwitchMatch {

    public static void main(String... args) {

        // Integer val = Integer.valueOf(10);
        // Double val = Double.valueOf(10);
        Float val = Float.valueOf(10);

        String msg = switch((Number)val){
            case Integer i -> "Rounded: " + i;
            case Double d -> "Precise: " + d;
            case Number n -> "Unknown: " + n;
        };

        System.out.println(msg);

        Double val2 = Double.valueOf(10);

        msg = switch((Number)val2){
            case Number n -> "Unknown: " + n; // does not compile: dominating case
            case Integer i -> "Rounded: " + i; //  error: this case label is dominated by a preceding case label
            case Double d -> "Precise: " + d;
        };

        System.out.println(msg);
    }
}