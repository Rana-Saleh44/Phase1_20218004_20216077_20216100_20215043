import java.util.Arrays;
import java.util.Vector;

public class BankMisr extends Bank{
    public BankMisr(){
        AccountNumbers =new Vector<>(Arrays.asList("89255678912345","89255678978945","89255678914725"));
        MobileNumbers =new Vector<>(Arrays.asList("+201128436224","+201211708075","+201112345678"));
        Balance =new Vector<>(Arrays.asList(1000.0,5792.00,1245.32));
    }

}
