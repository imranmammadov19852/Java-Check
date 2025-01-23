public class BankAccount {
    private String username;
    private double balance;

    public BankAccount(String name){
        username = name;
    }

    public void setBalance(double amount){
        balance = amount;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }
}
