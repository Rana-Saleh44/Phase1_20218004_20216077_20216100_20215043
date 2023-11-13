public class ConcreteBankFactory implements BankFactory{
    public Bank CreateBank(String accountNumber){
        if(accountNumber.startsWith("2078") && accountNumber.length() == 14){
            return new BankCIP();
        }
        else if(accountNumber.startsWith("8925") && accountNumber.length() == 14){
            return new BankAlahly();
        }
        else if(accountNumber.startsWith("3314") && accountNumber.length() == 14){
            return new BankMisr();
        }
        return null;
    }
}