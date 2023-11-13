public class Account {
    protected User user;
    protected String accountNumber;
    protected double balance;


    public Account(String accountNumber) {

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

    public double inquireBalance() {
        return balance;
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
        return user.getUsername();
    }
}

