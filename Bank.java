import java.util.Vector;

abstract public class Bank {
    protected Vector<String> AccountNumbers;
    protected Vector<String> MobileNumbers;
    protected Vector<Double> Balance;

    public int verification(String accountNumber, String mobileNumber) {
        for (int i = 0; i < AccountNumbers.size(); i++) {
            if (AccountNumbers.get(i).equals(accountNumber) && MobileNumbers.get(i).equals(mobileNumber)) {
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