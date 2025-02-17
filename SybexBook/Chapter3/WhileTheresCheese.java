public class WhileTheresCheese {

    public static void main(String args[]) {

        int roomInBelly = 5;
        int bitesOfCheese = 7;
        while (roomInBelly > 0 && bitesOfCheese > 0) {
            System.out.println("Eating");
            bitesOfCheese--;
            roomInBelly--;
            System.out.println("Still hungry");
        }

        System.out.println("Mouse full");
            
    }
}