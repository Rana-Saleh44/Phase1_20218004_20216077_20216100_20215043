import java.util.UUID;
import java.util.Date;
import java.util.List;

abstract public class Bill {
    protected UUID billId;
    protected double amount;
    protected Date dueDate;
    protected boolean isPaid;
    protected String billType;
    protected String State;
    protected List <Observer> Subcribers;

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
    protected abstract void setState();
    protected void Notify(){
        for(Observer observer : Subcribers){
            observer.update(State);
        }
    }
}
