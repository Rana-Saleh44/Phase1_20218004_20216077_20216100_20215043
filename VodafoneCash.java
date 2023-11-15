public class VodafoneCash extends MobileWallet{
    private double balance;

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
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
}
