public class InstapayTransfer implements TransferStrategy {

    @Override
    public void transfer(double amount, AccountType SourceAccount, AccountType TargetAccount){
        SourceAccount.deductAmount(amount);



    }
}
