public interface BillPaymentStrategy {

    void payBill(Bill bill, AccountType account);
}
