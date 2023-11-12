import java.util.UUID;
import java.util.Date;
abstract public class Bill {
    private UUID billId;
    private double amount;
    private Date dueDate;
    private boolean isPaid;
    private String billType;

    public Bill(String billType,double amount){
        this.billId = UUID.randomUUID();
        this.billType = billType;
        this.amount = amount;
        this.isPaid = false;
    }
    public UUID getBillId(){
        return billId;
    }
    public String getBillType(){
        return billType;
    }

    public double getAmount() {
        return amount;
    }
    public boolean isPaid(){
        return isPaid;
    }
    public void markAsPaid(){
        this.isPaid =true;
    }
    public abstract String getBillDetails();
}
