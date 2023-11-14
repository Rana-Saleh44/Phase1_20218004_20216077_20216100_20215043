public class GasBillPayment implements BillPaymentStrategy{
    @Override
    public void payBill(Bill bill,AccountType account) {
        System.out.println("Paying Gas Bill: " + bill.getBillId() + " from Account: " + account.getAccountNumber());
        account.deductAmount(bill.getAmount());
        bill.markAsPaid();
    }


}
