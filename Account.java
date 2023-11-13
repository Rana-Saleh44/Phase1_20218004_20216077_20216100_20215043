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
    public String getAccountNumber(){
        return accountNumber;
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
    public void deductAmount(double amount){
        if(balance >= amount)
            balance -=amount;
        else
            System.out.println("Insufficient funds in the account. ");
    }

    public void addAmount(double amount){
        balance += amount;
    }

    public String getUsername() {
        return username;
    }
}

