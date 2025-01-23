public class Main{
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Ali");
        BankAccount account2 = new BankAccount("Murad");

        account1.setBalance(2.11);
        account2.setBalance(4.78);

        account1.deposit(321.28);
        account2.deposit(91.69);
        
        // Before
        System.out.println("Before Tax:");
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());

        account1.withdraw(account1.getBalance()*0.07);
        account2.withdraw(account2.getBalance()*0.07);

        // After
        System.out.println("\nAfter Tax:");
        System.out.printf("%.2f\n", account1.getBalance());
        System.out.printf("%.2f", account2.getBalance());
    }
}