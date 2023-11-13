public interface BillPaymentStrategy {

    void payBill(Bill bill, Account account);
}
