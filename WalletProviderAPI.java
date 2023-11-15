import java.util.Scanner;

public class WalletProviderAPI extends AccountType {
    private MobileWallet mobilewallet;

    public boolean verifyMobileNumberWithWalletProvider(String mobileNumber) {
        System.out.println("Verifying mobile number with wallet provider API for: " + mobileNumber);
        return true;
    }

    public <T extends MobileWallet> void Checking(String mobileNumber) {
        if (mobilewallet.verifyMobileNumber()) {
            mobilewallet.verifyOTP();
        } else {
            System.out.println("Account Not Found");
        }
    }

    public static WalletProviderAPI createAccount(String mobileNumber, MobileWallet mobileWallet) {
        WalletProviderAPI walletAPI = new WalletProviderAPI();
        walletAPI.mobilewallet = mobileWallet;
        walletAPI.mobilewallet.setMobileNumber(mobileNumber);
        return walletAPI;
    }

    public void chooseProvider() {
        System.out.println("Please choose a wallet provider :");
        Scanner s = new Scanner(System.in);
    }
}
