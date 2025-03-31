public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public String getName(){
        return name;
    }

    public double getCreditLimit(){
        return creditLimit;
    }

    public String getEmail(){
        return email;
    }

    public Customer() {
        this("NoName", 0.0, "NoEmail");
    }

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(String name, String email) {
        this(name, 0.0, email);
    }
}