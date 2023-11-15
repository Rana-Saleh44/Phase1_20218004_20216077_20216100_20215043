import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AccountList {
    List<Account> accountList = new ArrayList<>();

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccount(Account account) {
        for (Account account1 : accountList) {
            if (Objects.equals(account1.getEmail(), account.getEmail())) {
                System.out.println("The email already exits please enter another one :");
                return;
            } else {
                accountList.add(account);
            }
        }
    }
    public Account getAccount(String email , String password){
        for (Account account1 : accountList) {
            if (account1.getEmail() == email && account1.getPassword() == password) {
                System.out.println("Welcome");
                return account1;
            }
        }
        System.out.println("Wrong email or password please try again");
        return null;
    }

}
