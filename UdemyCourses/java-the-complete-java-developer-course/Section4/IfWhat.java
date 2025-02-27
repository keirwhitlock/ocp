public class IfWhat {

    public static void main(String... args) {

        boolean isAlien = false;

        if(isAlien == false)
            System.out.println("it is not an alian");

        int topScore = 100;
        if(topScore != 100) {
             System.out.println("Top Score!");
        } else {
            System.out.println("Dumb ass!");
        }

        /* 
        0 0
        0 1
        1 1
        1 1
        */
        int first = 80, second = 190;
        if(first > 80 || second > 190) {
            System.out.println("Or what?!");
        }


        boolean isCar = false;
        
        // if is expecting a boolean, true is a boolean
        if (isCar = true) {     // single = !!! assigning true to isCar then triggering the if statement
            System.out.println("Woah! Shouldn't have got here!");
        }

        /*

        this would fail
        if (first = 90) {} 

        as we are trying to assign a int, which is not a boolean, that if wnats
        */
       
       if(isCar) {
            System.out.println("shortened version");
       }

       if(!isCar) {
            System.out.println("shortened version - wont print");
       }

    }
}