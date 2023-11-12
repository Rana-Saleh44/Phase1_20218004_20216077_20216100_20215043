public class ElectricityBillPayment implements BillPaymentStrategy{
    @Override
    public void payBill(Bill bill){
        System.out.println("Paying Electricity Bill: " +bill.getBillId() + " from Account: ");
    }

}
