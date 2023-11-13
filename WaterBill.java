public class WaterBill extends Bill{
    private String waterSupplier;
    public WaterBill(String waterSupplier, double amount){
        super("Water",amount);
        this.waterSupplier =waterSupplier;
    }
    public String getWaterSupplier(){
        return waterSupplier;
    }
    @Override
    public String getBillDetails(){
        return "Water Bill: "+getBillId() + ", Supplier: "+waterSupplier + ", Amount: $"+getAmount();
    }
    @Override
    protected void setState(){
        this.State = "Water Bill is released";
    }
}
