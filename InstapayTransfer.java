public class InstapayTransfer implements TransferStrategy {

    @Override
    public void transfer(double amount, Account SourceAccount, Account TargetAccount){
        SourceAccount.deductAmount(amount);
        TargetAccount.addAmount(amount);
    }
}
