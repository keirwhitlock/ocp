public class Main {

    public static void main(String[] args) {

        Account account = new Account();
        // Account account = new Account("Keir Whitlock", "Keir@example.com", 02330123456);
        
        // account.setCustomerName("Keir Whitlock");
        // account.setPhoneNumber(02330123456);
        // account.setEmail("Keir@example.com");

        account.makeDeposit(1000.0);
        account.makeWithdrawal(100.0);
        account.makeWithdrawal(1000.0);

        Customer customer1 = new Customer();
        Customer customer2 = new Customer("Bobby", 1000, "bob@bobby.bob");
        Customer customer3 = new Customer("Nobby", "nobby@example.com");

        System.out.printf("%s %s %s\n", customer1.getName(), customer1.getCreditLimit(), customer1.getEmail());
        System.out.printf("%s %s %s\n", customer2.getName(), customer2.getCreditLimit(), customer2.getEmail());
        System.out.printf("%s %s %s\n", customer3.getName(), customer3.getCreditLimit(), customer3.getEmail());

    }
}