public class BankTransfer implements TransferStrategy {
    @Override
    public void transfer(double amount, AccountType SourceAccount,String Account) {
        SourceAccount.deductAmount(amount);
        BankAccount account = new BankAccount();
        BankAPI bankAPI = account.getBankAPI();
        bankAPI.

    }
}
