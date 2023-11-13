public class WalletProviderAPI
{
    private static double initialBalance = 1000.0;

    public boolean verifyMobileNumberWithWalletProvider(String mobileNumber)
    {
        System.out.println("Verifying mobile number with wallet provider API for: " + mobileNumber);
        return true;
    }

    public boolean transferToMobileWallet(String senderMobileNumber, String receiverMobileNumber, double amount,String electronicPaymentName)
    {
        if (initialBalance >= amount)
        {
            System.out.println("Transferring " + amount + " from " + senderMobileNumber + " to " + receiverMobileNumber);
            initialBalance -= amount;
            System.out.println("Money transfer successful through "+ electronicPaymentName);
            System.out.println("Remaining balance: " + initialBalance);
            return true;
        }
        else
        {
            System.out.println("Money transfer failed. Insufficient balance.");
            return false;
        }
    }
}
