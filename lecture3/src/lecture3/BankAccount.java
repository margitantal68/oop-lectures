package lecture3;

// Not immutable
public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount){
        if(amount > 0 ) {
            this.balance += amount;
        }
    }

    public boolean withdraw(double amount){
        if(amount <= balance ){
            this.balance -= amount;
            return true;
        }
        return false;
    }

}
