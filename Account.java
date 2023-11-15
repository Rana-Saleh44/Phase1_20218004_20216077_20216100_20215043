public class Account implements Observer {
    private String MobileNumber;
    private String Name;
    private String UserName;
    private String Email;
    private String Password;
    private int age;
    private TransferStrategy transferStrategy;

    public Account(){}
    public Account(String email,String password,String UserName,String name, int age , String MobileNumber){
        this.Email = email;
        this.Password = password;
        this.UserName = UserName;
        this.Name= name;
        this.MobileNumber = MobileNumber;
    }

    public String getPassword() {
        return Password;
    }

    public Account(String email, String password){
        this.Email = email;
        this.Password = password;
    }

    public String getName() {
        return Name;
    }


    public int getAge() {
        return age;
    }


    public String getUsername() {
        return UserName;
    }


    public String getEmail() {
        return Email;
    }

    @Override
    public void update(String event) {
        System.out.println(event);
    }
    public void TransferMoney(TransferStrategy transferStrategy){
        this.transferStrategy = transferStrategy;
    }

}
