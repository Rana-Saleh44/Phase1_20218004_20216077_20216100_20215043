public interface TransferStrategy {
    void transfer(double amount, AccountType SourceAccount, String TargetAccount);
}
