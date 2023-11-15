import java.util.Objects;

public class BankAccount extends AccountType {
    private BankAPI bankAPI = new BankAPI();
    private BankCIP bankCIP = new BankCIP();
    private String AccountNumber;

    public void LoginToMyAccount(Account userAccount, String accountNumber) {
        Bank bank = bankAPI.getBank();
        for (int i = 0; i < bankCIP.getAccountNumbers().size(); i++) {
            if (Objects.equals(accountNumber, bankCIP.getAccountNumbers().get(i))) {
                this.AccountNumber = accountNumber;
            }
        }
        if (userAccount.equals(this.UserAccount)) {
            this.AccountNumber = accountNumber;
        } else {
            System.out.println("Login Failed!");
        }
    }

    public double getBalance() {
        this.Balance = this.bankAPI.getBalance();
        return Balance;
    }

    public BankAPI getBankAPI() {
        return bankAPI;
    }

}