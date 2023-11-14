public class AccountType {

    private TransferStrategy transferStrategy;
    protected String accountNumber;
    protected double balance;


    public AccountType() {
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double inquireBalance() {
        return balance;
    }

    public void deductAmount(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds in the account. ");
    }

    public void addAmount(double amount) {
        balance += amount;
    }


    public void TransferMoney(TransferStrategy transferStrategy){
        this.transferStrategy = transferStrategy;
    }
}

