public class Main {

    public static void main(String... args) {

        Car car = new Car();
        car.describeCar();

        car.setMake("Ford");
        car.setModel("Fiesta");
        car.setColour("Red");
        car.setDoors(5);
        car.setConvertible(false);
        
        car.describeCar();

        System.out.println(car.isConvertible());
    }
}