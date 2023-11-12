public class WaterBillPayment implements BillPaymentStrategy{
    @Override
    public void payBill(Bill bill){
        System.out.println("Paying Water Bill: " +bill.getBillId() + " from Account: ");
    }

}
