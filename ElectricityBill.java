public class ElectricityBill extends Bill{
    private String electricityProvider;
    public ElectricityBill(String electricityProvider, double amount){
        super("Electricity",amount);
        this.electricityProvider = electricityProvider;
    }
    public String getElectricityProvider(){
        return electricityProvider;
    }
    @Override
    public String getBillDetails(){
        return "Electricity Bill: "+getBillId()+", Provider: "+electricityProvider+ ", Amount: $"+ getAmount();
    }
}
