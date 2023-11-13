import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class MobileWallet extends Account
{
    List<String> usernames=new ArrayList<String>();
    private String mobileNumber;
    private boolean numberVerification;
    protected int OTPn;

  /*  public MobileWallet(String mobileNumber,boolean numberVerification)
    {
        this.mobileNumber = mobileNumber;
        this.numberVerification = false;
    }*/

    public MobileWallet(String username, String password, String mobileNumber, String accountNumber)
    {
        super(username, password, mobileNumber, accountNumber);
    }

    public boolean verifyMobileNumber()
    {
         if(mobileNumber.startsWith("010") || mobileNumber.startsWith("011") || mobileNumber.startsWith("012") || mobileNumber.startsWith("015"))
         {
             return true;
         }
         else
             return false;
    }
    public boolean sendVerificationCode()
    {
        System.out.println("Sending verification code to " + mobileNumber);
        return true;
    }

    public String receiveVerificationCode()
    {
        String verificationCode = "123456";
        return verificationCode;
    }
    public int generateOTP()
    {
        Random random = new Random();
        OTPn = random.nextInt();
        return OTPn;
    }
    public boolean verifyOTP()
    {
        System.out.println("Please enter the OTP that was sent :");
        Scanner s = new Scanner(System.in);
        int otp = s.nextInt();
        if (otp == OTPn)
        {
            System.out.println("OTP is verified");
            return true;
        }
        else
            System.out.println("OTP is not verified");
            return false;
    }
    public boolean isUniqueUsername(String uUsername)
    {
        return !usernames.contains(username);
    }
    public void addUser(String username)
    {
        usernames.add(username);
    }
    public void checkingUsername()
    {
        Scanner u = new Scanner(System.in);
        String username;
        System.out.print("Enter username: ");
        username = u.next();

        if (!isUniqueUsername(username))
        {
            System.out.println("Username is not unique. Please choose a different one.");
        }
        addUser(username);

        System.out.println("Username successfully registered!");
    }
}

