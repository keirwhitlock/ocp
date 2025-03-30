public class Car {

    private String make;
    private String model;
    private String colour;
    private int doors;
    private boolean convertible;

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public String getColour(){
        return colour;
    }

    public int getDoors(){
        return doors;
    }

    public boolean isConvertible(){
        return convertible;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.printf("A %d door %s, %s %s%s\n", doors, colour, make, model, (convertible ? " convertible." : "."));
    }
}