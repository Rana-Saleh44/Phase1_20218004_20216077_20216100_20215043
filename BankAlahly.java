import java.util.Arrays;
import java.util.Vector;

public class BankAlahly extends Bank {

    private Vector<String> AccountNumbers =new Vector<>(Arrays.asList("89255678912345","89255678978945","89255678914725"));
    private Vector<String> MobileNumbers =new Vector<>(Arrays.asList("+201128436224","+201211708075","+201112345678"));
    private Vector<Double> Balance =new Vector<>(Arrays.asList(1000.0,5792.00,1245.32));

    public Vector<String> getAccountNumbers() {
        return AccountNumbers;
    }

    public Vector<String> getMobileNumbers() {
        return MobileNumbers;
    }

    public Vector<Double> getBalance() {
        return Balance;
    }
}

