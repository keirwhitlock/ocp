public class Main {

    public static void main(String[] args) {

        Account account = new Account();
        
        account.setCustomerName("Keir Whitlock");
        account.setPhoneNumber(02330123456);
        account.setEmail("Keir@example.com");
        account.makeDeposit(1000.0);
        account.makeWithdrawal(100.0);
        account.makeWithdrawal(1000.0);
    }
}