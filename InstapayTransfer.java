public class InstapayTransfer implements TransferStrategy {

    @Override
    public void transfer(double amount, AccountType SourceAccount, String TargetAccount){
        SourceAccount.deductAmount(amount);


    }
}
