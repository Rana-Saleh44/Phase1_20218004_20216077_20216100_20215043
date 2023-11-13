import java.util.Scanner;

public class BankAPI{
    Scanner input = new Scanner(System.in);
    private Banks bank;
    private int otpCounter = 0;
    private int option = 1;
    private String GenerateOTP(){
        otpCounter++;
        return String.format("%06d", otpCounter);
    }
    private boolean verifyOTP(String userEnteredOTP){
        return GenerateOTP().equals(userEnteredOTP);
    }
    private void SendOTP(){
        System.out.print("Please enter the OTP sent to your mobile phone: ");
        String OTP = input.nextLine();
        if(verifyOTP(OTP)){
            System.out.println("OTP is verified.");
        }
        else{
            System.out.println("OTP verification failed.");
        }
        option = 0;
    }
    public<T extends Banks> void Checking(T bank, String accountNumber, String mobileNumber)
    {
        if(bank.CheckAccountNumber(accountNumber) && bank.CheckMobileNumber(mobileNumber)){
            SendOTP();
        }
        else{
            System.out.println("Account Not Found");
        }
    }
    public void TransitionToBank(String accountNumber, String mobileNumber){
        while (option != 0) {
        
            if(accountNumber.charAt(0) == '2' && accountNumber.charAt(1) == '0' && accountNumber.charAt(2) == '7' && accountNumber.charAt(3) == '8' && accountNumber.length() == 14){
                bank = new BankCIP();
                Checking(bank, accountNumber, mobileNumber);
            }
            else if(accountNumber.charAt(0) == '8' && accountNumber.charAt(1) == '9' && accountNumber.charAt(2) == '2' && accountNumber.charAt(3) == '5' && accountNumber.length() == 14){
                bank = new BankAlahly();
                Checking(bank, accountNumber, mobileNumber);
            }
            else if(accountNumber.charAt(0) == '3' && accountNumber.charAt(1) == '3' && accountNumber.charAt(2) == '1' && accountNumber.charAt(3) == '4' && accountNumber.length() == 14){
                bank = new BankMisr();
                Checking(bank, accountNumber, mobileNumber);
            }
            else{
                System.out.println("Account Number is Invalid!");
                System.out.print("Please Enter Again(1) or Exit(0)  ");
                option = input.nextInt();
                switch (option) {
                    case 1:
                        input.nextLine();
                        System.out.print("Account Number: ");
                        accountNumber = input.nextLine();
                        System.out.print("Mobile Number: ");
                        mobileNumber = input.nextLine();
                        break;
                
                    case 0:
                    default:
                        break;
                }     
            }
        }
        input.close();
    }
}