import java.util.Vector;

public class BankMisr {
    private Vector<String> AccountNumbers;
    private Vector<String> MobileNumbers;
    public BankMisr() {
        AccountNumbers = new Vector<>();
    }
    protected boolean CheckAccountNumber(String accountNumber){
        return AccountNumbers.contains(accountNumber);
    }
    protected boolean CheckMobileNumber(String mobileNumber){
        return MobileNumbers.contains(mobileNumber);
    }
}
