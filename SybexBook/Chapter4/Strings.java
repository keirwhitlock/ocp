public class Strings {

    public static void main(String[] args) {
        
        String myName = "KeIr";

        //System.out.println(myName.charAt(myName.length()));  // will throw and exception, as index count from 0 but length is from 1

        String kitcat = 1 + 2 + "3";
        //System.out.println(kitcat);

        kitcat = "3" + 1 + 2 ;
        //System.out.println(kitcat);

        String onPoint = "hi";
        //System.out.println(onPoint.codePointAt(0));

        //System.out.println(myName.length());
        //System.out.println(myName.substring(0, myName.length()));  // end index is upto but not including

        /*
        System.out.println(myName.indexOf("K"));
        System.out.println(myName.indexOf("W")); // returns -1 not found
        System.out.println(myName.indexOf("e", 1)); // starting index
        System.out.println(myName.indexOf("r", 1, 3)); // starting index, ending up to index
        */

       System.out.println(myName);
       System.out.println(myName.toLowerCase());
       System.out.println(myName.toUpperCase());

        String newName = "KeIr";
        System.out.println(myName.equals(newName));

        newName = "Darren";
        System.out.println(myName.equals(newName));
    }
}