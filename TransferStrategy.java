public interface TransferStrategy {
    void transfer(double amount, Account SourceAccount, Account TargetAccount);
}
