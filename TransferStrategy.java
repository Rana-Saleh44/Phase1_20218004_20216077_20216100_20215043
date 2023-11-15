public interface TransferStrategy {
    void transfer(double amount, AccountType SourceAccount, AccountType TargetAccount);
}
