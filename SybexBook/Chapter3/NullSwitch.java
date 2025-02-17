public class NullSwitch {

    public static void main(String[] args) {


        String fish = null;

        //java.lang.NullPointerException
        /*
        System.out.println(switch(fish){
            case "Clownfish" -> "Hello!";
            case "BlueTang" -> "Hello again!";
            default -> "Goodbye";
        });
        */

        if(fish == null){
            System.out.println("What type of fish are you?");
        } else {
            System.out.println(switch(fish){
                case "Clownfish" -> "yo";
                case "Blowfish" -> "hi";
                default -> "Goodbye";
            });
        }

        /*
        System.out.println(switch(fish){
            case "Clownfish" -> "Clowning around";
            default -> "Boo";
            case null -> "Null val man"; // error: this case label is dominated by a preceding case label
        });
        */

        System.out.println(switch(fish){
            case null -> "Null val man"; 
            case "Clownfish" -> "Clowning around";
            default -> "Boo";
        });
    }
} 