public class IYield {

    public static void main(String... args){

        int fish = 5;
        int length = 12;

        var name = switch (fish) {
            case 1 -> "Goldfish";
            case 2 -> { yield "Trout"; }
            case 3 -> {
                if (length > 10) yield "Blobfish";
                else yield "Green";
            }
            case 4 -> {
                throw new RuntimeException("Unsupported value");
            }
            default -> "Swordfish";
        }; // end a switch expression with ;

        System.out.println(name);
    }
}