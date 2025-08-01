package Assignment6;


public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(12345, 1000.0);

        // Deposit operation
        try {
            account.deposit(500);
        } catch (InvalidAmountException e) {
            System.out.println("Deposit Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }

        // Withdrawal operation
        try {
            account.withdraw(2000); // This will throw InsufficientFundsException
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Withdrawal Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }
    }
}
