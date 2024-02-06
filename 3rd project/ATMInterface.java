public class ATMInterface {

    private Bank_Account bankAccount;
    
    public ATMInterface(Bank_Account account) {
        bankAccount = account;
    }

    public void withdraw(double amount) {
        // Withdraw implementation

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        } else if (amount <= bankAccount.getBalance()) {
            double new_Balance = bankAccount.getBalance() - amount;
            bankAccount.setBalance(new_Balance);
            System.out.println("Withdrawal successful. New balance is: " + new_Balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
    
    public void deposit(double amount) {
        // Deposit implementation

        double new_Balance = bankAccount.getBalance() + amount;
        bankAccount.setBalance(new_Balance);
        System.out.println("Deposit successful. New balance is: " + new_Balance);
    }
    
    public double checkBalance() {
        // Checking balance implementation

        return bankAccount.getBalance();
    }

public class Bank_Account {
    
    private double balance;
    
    public Bank_Account(double initial_Balance) {
        balance = initial_Balance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double new_Balance) {
        balance = new_Balance;
    }
}
}
    
