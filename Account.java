public abstract class Account {
    protected String UserName;
    protected String Email;
    protected String Password;
    protected String MobileNumber;
    protected String AccountNumber;
    protected double Balance;

    public String getMobileNumber() {
        return MobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Account() {
    }

    public Account(String email, String password) {
        this.email = email;
        this.password = password;
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

    public String getUsername() {
        return username;
    }
}

