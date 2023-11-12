public class InstapayTransfer implements TransferStrategy {

    @Override
    public void transfer(double amount, Account SourceAccount, Account TargetAccount) {
        if (SourceAccount.getBalance() >= amount) {
            SourceAccount.setBalance(SourceAccount.getBalance() - amount);
            TargetAccount.setBalance(TargetAccount.getBalance() + amount);
            System.out.println("Transfer successful");
        } else {
            System.out.println("The amount you want transfer is bigger than your amount in the instapay wallet");
        }
    }
}
