public class Account implements Observer {
    private String MobileNumber;
    private String Name;
    private String UserName;
    private String Email;
    private String Password;
    private int age;

    public Account(){}
    public Account(String email,String password){
        this.Email = email;
        this.Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return UserName;
    }

    public void setUsername(String username) {
        this.UserName = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    @Override
    public void update(String event) {
        System.out.println(event);
    }

}
