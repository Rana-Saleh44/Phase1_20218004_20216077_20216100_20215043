public class BankAccount extends AccountType{
    private BankAPI bankAPI = new BankAPI();
    private String AccountNumber;

    public void LoginToMyAccount(Account userAccount, String accountNumber){
        
        if(userAccount.equals(this.UserAccount)){
            this.AccountNumber = accountNumber;
        }
        else{
            System.out.println("Login Failed!");
        }
    }
    public double getBalance(){
        this.Balance = this.bankAPI.getBalance();
        return Balance;
    }
    public BankAPI getBankAPI(){
        return bankAPI;
    }

}