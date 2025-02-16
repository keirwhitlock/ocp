public class SwitchDips {

    public static void main(String[] args) {

        String animal = "monkey";

    
        // switch statement
        switch (animal) {
            case "moose": System.out.println("We've got a moose."); break;
            case "monkey": System.out.println("We've got a monkey."); // notice without the break, we continue from the match onwards
            case "deer": System.out.println("We've got a deer."); break;
            default: System.out.println("Hit the default"); break; // as last in the list break; isn't strictly required.
        }

        // switch expression
        String r = switch (animal) { // expressions return a value
            default -> "Default"; // default doesn't have to come last

            case "moose" -> "Found a moose.";  // notice no breaks on a switch expression
            case "monkey" -> "Found a monkey.";
            case "deer" -> "Found a deer";
        };
        System.out.println(r);

        /*
        switch (animal) {
            case "monkey": System.out.println("monkey"); break;
            case "deer" -> System.out.println("deer"); break; // wont compile as : or -> not consistant, tho both are valid
        }
        */

    }
}