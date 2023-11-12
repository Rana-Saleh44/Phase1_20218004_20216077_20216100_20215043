public class GasBill extends Bill{
    private String gasCompany;
    public GasBill(String gasCompany, double amount){
        super("Gas",amount);
        this.gasCompany =gasCompany;
    }
    public String getGasCompany(){
        return gasCompany;
    }
    @Override
    public String getBillDetails(){
        return "Gas Bill: "+getBillId() +", Company: "+ gasCompany+", Amount: $"+ getAmount();
    }

}
