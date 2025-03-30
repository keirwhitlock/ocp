import java.util.Random;

public class Account {
    

    private String customerName;
    private String email;
    private int phoneNumber;
    private double balance=0.0;
    private int accountNumber = generateAccountNumber();

    public String getCusomerName(){
        return customerName;
    }

    public String getEmail(){
        return email;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void printBalance(){
        System.out.printf("Your balance for account number %d is: £%s\n", this.getAccountNumber(), this.getBalance());
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    private int generateAccountNumber(){
        Random rand = new Random();
        int number = 0;
        for(int i = 0; i < 9; i++) {
            number = 10000000 + rand.nextInt(9000000);
        }
        return number;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void makeDeposit(double amount) {
        balance += amount;
        printBalance();
    }

    public void makeWithdrawal(double amount) {
        System.out.printf("Attempting to withdraw £%s from account number %d\n", amount, accountNumber);
        
        if((balance - amount) > 0) {
            balance -= amount;
        } else {
            System.out.println("Sorry you dont have enough funds.");
        }
        printBalance();
    }


}