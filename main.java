import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        AccountType accountType;
        AccountList accountList = new AccountList();
        while (true) {
            System.out.println("1 - sign up");
            System.out.println("2 - sign in");
            System.out.println("0 - exit");
            int choice, age;
            String name, mobileNumber, password, email, username;
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
            Account account = new Account();
            while (choice != 0) {
                if (choice == 1) {
                    scan.nextLine();
                    System.out.print("Enter your name: ");
                    name = scan.nextLine();
                    System.out.print("Enter your username: ");
                    username = scan.nextLine();
                    System.out.print("Enter your age: ");
                    age = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter your Mobile number: ");
                    mobileNumber = scan.nextLine();
                    System.out.println("Enter your password: ");
                    password = scan.nextLine();
                    System.out.println("Enter your email: ");
                    email = scan.nextLine();
                    account = new Account(email, password, username, name, age, mobileNumber);
                    accountList.setAccount(account);
                } else if (choice == 2) {
                    int counter = 0;
                    do {
                        System.out.println("Enter your email: ");
                        email = scan.nextLine();
                        System.out.println("Enter your password: ");
                        password = scan.nextLine();
                        account = accountList.getAccount(email, password);
                        counter++;
                    } while (account == null && counter != 4);
                } else if (choice == 0) {
                    System.out.println("Goodbye");
                    return;
                } else
                    System.out.println("Wrong choice, please try again");
            }

            System.out.println("choice account type: ");
            System.out.print("1- bank account 2-mobile wallet");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    accountType = new BankAccount();
                    BankAccount bankAccount = (BankAccount) accountType;
                    System.out.print("Enter your bank number: ");
                    String accountNumber;
                    accountNumber = scan.nextLine();
                    bankAccount.LoginToMyAccount(account, accountNumber);
                    do {
                        System.out.println("1-TransferMoney\n2-PayBill\n0-exit");
                        choice = scan.nextInt();
                        scan.nextLine();
                        switch (choice) {
                            case 1:

                                break;

                            case 2:

                                break;

                            default:
                                break;
                        }
                    } while (choice!=0);
                    break;
                case 2:
                    accountType = new MobileWallet();
                    MobileWallet mobileWallet = (MobileWallet) accountType;

                    break;
                default:
                    System.out.println("wrong choice");
                    break;
            }
        }
    }
}

