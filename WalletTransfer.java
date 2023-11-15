public class WalletTransfer implements TransferStrategy {
    @Override
    public void transfer(double amount, AccountType SourceAccount, AccountType TargetAccount) {
        SourceAccount = new VodafoneCash();
        TargetAccount = new VodafoneCash();
        SourceAccount.deductAmount(amount);
        TargetAccount.addAmount(amount);
    }
}
