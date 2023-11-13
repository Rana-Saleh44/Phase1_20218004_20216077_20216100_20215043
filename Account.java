public class Account {
    private String username;
    private String password;
    private String mobileNumber;
    private String accountNumber;
    private double balance;


    public Account(String username, String password, String mobileNumber, String accountNumber) {
        this.username = username;
        this.password = password;
        this.mobileNumber = mobileNumber;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void transferToWallet(String walletMobileNumber, double amount) {

    }

    public void transferToInstapayAccount(String accountUsername, double amount) {

    }

    public double inquireBalance() {
        return balance;
    }

    public void payBill(String billType) {

    }

    public String getUsername() {
        return username;
    }
}

