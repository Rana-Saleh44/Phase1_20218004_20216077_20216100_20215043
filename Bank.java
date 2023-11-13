import java.util.Vector;

public class Banks {
    private Vector<String> AccountNumbers;
    private Vector<String> MobileNumbers;
    public Banks() {
        AccountNumbers = new Vector<>();
    }
    protected boolean CheckAccountNumber(String accountNumber){
        return AccountNumbers.contains(accountNumber);
    }
    protected boolean CheckMobileNumber(String mobileNumber){
        return MobileNumbers.contains(mobileNumber);
    }
}
