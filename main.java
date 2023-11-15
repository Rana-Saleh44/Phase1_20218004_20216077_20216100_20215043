import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        AccountType accountType;
        AccountList accountList = new AccountList();
        TransferStrategy transferStrategy;
        Scanner scan = new Scanner(System.in);
        int option = 1;
        while (option != 0) {
            System.out.println("1 - sign up");
            System.out.println("2 - sign in");
            System.out.println("0 - exit");
            int choice, age;
            String name, mobileNumber, password, email, username;
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
                    System.out.print("Enter your email: ");
                    email = scan.nextLine();
                    System.out.print("Enter your password: ");
                    password = scan.nextLine();
                    account = new Account(email, password, username, name, age, mobileNumber);
                    accountList.setAccount(account);
                    break;
                } else if (choice == 2) {
                    scan.nextLine();
                    System.out.println("Enter your email: ");
                    email = scan.nextLine();
                    System.out.println("Enter your password: ");
                    password = scan.nextLine();
                    account = accountList.getAccount(email, password);

                } else {
                    System.out.println("Goodbye");
                    break;
                } 
                System.out.println("choice account type: ");
                System.out.println("1- bank account 2-mobile wallet");
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
                                    accountType = new BankAccount();
                                    BankAccount bank = (BankAccount) accountType;
                                    System.out.println("Enter the account number: ");
                                    String AccountNumber, MobileNumber;
                                    double amount;
                                    AccountNumber = scan.nextLine();
                                    System.out.println("Enter mobile number: ");
                                    MobileNumber = scan.nextLine();
                                    System.out.println("Enter amount you want to transfer: ");
                                    amount = scan.nextDouble();
                                    scan.nextLine();
                                    bank.getBankAPI().TransitionToBank(AccountNumber, MobileNumber);
                                    transferStrategy = new BankTransfer();
                                    account.TransferMoney(transferStrategy);
                                    account.Transfer(amount, accountType, accountType);
                                    break;
                                case 2:
                                    System.out.print("Enter Type of bill: ");
                                    String type = scan.nextLine();
                                    System.out.print("Enter amount: ");
                                    double AMount = scan.nextDouble();
                                   // Bill bill = new Bill(type, amount);
                                    break;

                                default:
                                    break;
                            }
                        } while (choice != 0);
                        break;
                    case 2:
                        accountType = new MobileWallet();
                        MobileWallet mobileWallet = (MobileWallet) accountType;
                        System.out.print("Enter your mobile number: ");
                        String mobilenumber;
                        mobilenumber = scan.nextLine();
                        //mobileWallet.LoginToMyAccount(mobileWallet, accountNumber);
                        do {
                            System.out.println("1-TransferMoney\n2-PayBill\n0-exit");
                            choice = scan.nextInt();
                            scan.nextLine();
                            switch (choice) {
                                case 1:
                                    accountType = new BankAccount();
                                    BankAccount bank = (BankAccount) accountType;
                                    System.out.println("Enter the account number: ");
                                    String AccountNumber, MobileNumber;
                                    double amount;
                                    AccountNumber = scan.nextLine();
                                    System.out.println("Enter mobile number: ");
                                    MobileNumber = scan.nextLine();
                                    System.out.println("Enter amount you want to transfer: ");
                                    amount = scan.nextDouble();
                                    scan.nextLine();
                                    bank.getBankAPI().TransitionToBank(AccountNumber, MobileNumber);
                                    transferStrategy = new BankTransfer();
                                    account.TransferMoney(transferStrategy);
                                    account.Transfer(amount, accountType, accountType);
                                    break;
                                case 2:
                                    
                                    break;

                                default:
                                    break;
                            }
                        } while (choice != 0);
                        break;
                    default:
                        System.out.println("wrong choice");
                        break;
                }
            }
        option = choice;
        }
    }
}

