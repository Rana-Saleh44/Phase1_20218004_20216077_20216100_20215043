public class GasBillPayment implements BillPaymentStrategy{
    @Override
    public void payBill(Bill bill){
        System.out.println("Paying Gas Bill: " +bill.getBillId() + " from Account: ");
    }

}
