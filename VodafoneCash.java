import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VodafoneCash extends MobileWallet {
    private double balance = 1000;
    private Vector<String> Users =new Vector<>(Arrays.asList("+201128436224","+201211708075","+201112345678"));
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deductAmount(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds in the account. ");
    }

    public void addAmount(double amount) {
        balance += amount;
    }
}
