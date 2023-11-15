import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class MobileWallet extends AccountType {
    private String mobileNumber;
    private boolean numberVerification;
    protected int OTPn;
    private WalletProviderAPI walletProviderAPI = new WalletProviderAPI();

    public WalletProviderAPI getWalletProviderAPI() {
        return walletProviderAPI;
    }

    public boolean verifyMobileNumber() {
        if (mobileNumber.startsWith("+20") && numberOfDigits(mobileNumber) == true) {
            return true;
        } else
            return false;
    }

    public void sendVerificationCode(String mobileNumber) {
        System.out.println("Sending verification code to " + mobileNumber);
    }

    public String receiveVerificationCode() {
        String verificationCode = "123456";
        return verificationCode;
    }

    public int generateOTP() {
        Random random = new Random();
        OTPn = random.nextInt();
        return OTPn;
    }

    public boolean verifyOTP() {
        System.out.println("Please enter the OTP that was sent :");
        Scanner s = new Scanner(System.in);
        int otp = s.nextInt();
        if (otp == OTPn) {
            System.out.println("OTP is verified");
            return true;
        } else {
            System.out.println("OTP is not verified");
            return false;
        }
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public static boolean numberOfDigits(String number) {
        return String.valueOf(number).length() == 11;
    }
}

