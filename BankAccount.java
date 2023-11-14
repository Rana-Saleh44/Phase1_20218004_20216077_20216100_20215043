public class BankAccount extends AccountType{
    private BankAPI bankAPI;
    private String AccountNumber;

    public void LoginToMyAccount(Account useraccount, String accountnumber){
        if(useraccount.equals(this.UserAccount)){
            this.AccountNumber = accountnumber;
        }
        else{
            System.out.println("Login Failed!");
        }
    }
    
}