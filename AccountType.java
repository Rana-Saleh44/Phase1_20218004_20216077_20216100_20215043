abstract class AccountType {

    private TransferStrategy transferStrategy;
    protected Account UserAccount;
    protected double Balance;
    private String AccountNumber;



    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
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

