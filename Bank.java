import java.util.Vector;

abstract public class Bank {
    protected Vector<String> AccountNumbers = new Vector<>();
    protected Vector<String> MobileNumbers = new Vector<>();
    protected Vector<Double> Balance = new Vector<>();

    BankCIP bankCIP = new BankCIP();

    public int verification(String accountNumber, String mobileNumber) {
        for (int i = 0; i < bankCIP.getAccountNumbers().size(); i++) {
            if (bankCIP.getAccountNumbers().get(i).equals(accountNumber) && bankCIP.getMobileNumbers().get(i).equals(mobileNumber)) {
                return i;
            }
        }
        return -1;
    }

    public void setAccountNumbers(Vector<String> accountNumbers) {
        AccountNumbers = accountNumbers;
    }

    public void setMobileNumbers(Vector<String> mobileNumbers) {
        MobileNumbers = mobileNumbers;
    }

    public Double getBalance(int index) {
        return Balance.get(index);
    }

}