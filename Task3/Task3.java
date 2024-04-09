import java.util.Scanner;

// BankAccount class to represent the user's bank account
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true; // Withdrawal successful
        } else {
            return false; // Insufficient balance
        }
    }

    public double checkBalance() {
        return balance;
    }
}

// ATM class representing the ATM machine
class ATM {
    private BankAccount bankAccount;
    
    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void run() {
        while (true) {
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    if (bankAccount.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    bankAccount.deposit(depositAmount);
                    System.out.println("Deposit successful.");
                    break;

                case 3:
                    double balance = bankAccount.checkBalance();
                    System.out.println("Your balance is: Rs." + balance);
                    break;

                case 4:
                    System.out.println("Exiting ATM. Thank you!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

// Main class to demonstrate the ATM functionality
public class Task3 {
    public static void main(String[] args) {
        Scanner st=new Scanner(System.in);
        System.out.println("Enter your initial balance");
        int balance=st.nextInt();
        BankAccount account = new BankAccount(balance); 
        ATM atm = new ATM(account);
        atm.run();
    }

}

