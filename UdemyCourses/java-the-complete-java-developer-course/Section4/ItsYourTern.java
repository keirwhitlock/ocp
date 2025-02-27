public class ItsYourTern {

    public static void main(String args[]) {

        String makeOfCar = "Ford";
        boolean isFord = makeOfCar == "Ford" ? true : false;

        System.out.println(isFord);

        makeOfCar = "Tesla";
        isFord = makeOfCar == "Ford" ? true : false;
        
        System.out.println(isFord);
    }
}