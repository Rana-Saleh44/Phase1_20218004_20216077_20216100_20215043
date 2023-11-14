import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AccountList {
    List<Account> accountList = new ArrayList<>();

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccount(String email, String password) {
        Account account = new Account(email, password);
        for (Account account1 : accountList) {
            if (Objects.equals(account1.getEmail(), account.getEmail())) {
                System.out.println("The email already exits please enter another one :");
                return;
            } else {
                accountList.add(account);
            }
        }
    }

}
