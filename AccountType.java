public class AccountType {

    private TransferStrategy transferStrategy;
    protected Account UserAccount;
    protected double Balance;


    public AccountType() {
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        this.Balance = balance;
    }

    public double inquireBalance() {
        return Balance;
    }

    public void deductAmount(double amount) {
        if (Balance >= amount)
            Balance -= amount;
        else
            System.out.println("Insufficient funds in the account. ");
    }

    public void addAmount(double amount) {
        Balance += amount;
    }

    public void TransferMoney(TransferStrategy transferStrategy){
        this.transferStrategy = transferStrategy;
    }
}

