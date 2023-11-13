import java.util.Scanner;

public class BankAPI{
    private int otpCounter = 90;
    private String GenerateOTP(){
        otpCounter += 10;
        return String.format("%06d", otpCounter);
    }
    private boolean verifyOTP(String userEnteredOTP){
        return GenerateOTP().equals(userEnteredOTP);
    }
    private void SendOTP(String mobileNumber, String otp){

    }
    public void TransitionToBank(String accountNumber, String mobileNumber){
        Scanner input = new Scanner(System.in);
        int option = 1;
        int action = 1;
        String OTP;
        while (option != 0 && action != 0) {
        
            if(accountNumber.charAt(0) == '2' && accountNumber.charAt(1) == '0' && accountNumber.charAt(2) == '7' && accountNumber.charAt(3) == '8' && accountNumber.length() == 14){
                BankCIP bankCIP = new BankCIP();
                if(bankCIP.CheckAccountNumber(accountNumber) && bankCIP.CheckMobileNumber(mobileNumber)){
                    SendOTP(mobileNumber, GenerateOTP());
                    System.out.print("Please enter the OTP sent to your mobile phone: ");
                    OTP = input.nextLine();
                    if(verifyOTP(OTP)){
                        System.out.println("OTP is verified.");
                    }
                    else{
                        System.out.println("OTP verification failed.");
                    }
                    action = 0;
                    option = 0;
                }
            }
            else if(accountNumber.charAt(0) == '8' && accountNumber.charAt(1) == '9' && accountNumber.charAt(2) == '2' && accountNumber.charAt(3) == '5' && accountNumber.length() == 14){
                BankAlahly bankAlahly = new BankAlahly();
                bankAlahly.CheckAccountNumber(accountNumber);
                action = 0;
                option = 0;
            }
            else if(accountNumber.charAt(0) == '3' && accountNumber.charAt(1) == '3' && accountNumber.charAt(2) == '1' && accountNumber.charAt(3) == '4' && accountNumber.length() == 14){
                BankMisr bankMisr = new BankMisr();
                bankMisr.CheckAccountNumber(accountNumber);
                action = 0;
                option = 0;
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