import java.util.Vector;

public class Bank {
    private Vector<String> AccountNumbers;
    private Vector<String> MobileNumbers;
    public Bank() {
        AccountNumbers = new Vector<>();
    }
    protected boolean CheckAccountNumber(String accountNumber){
        return AccountNumbers.contains(accountNumber);
    }
    protected boolean CheckMobileNumber(String mobileNumber){
        return MobileNumbers.contains(mobileNumber);
    }
}
