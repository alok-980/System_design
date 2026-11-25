package BankAccount.enums;

public enum AccountType {
    SAVINGS(500.0),   // Minimum balance 500
    CURRENT(1000.0);  // Minimum balance 1000

    private final double minBalance;

    AccountType(double minBalance) {
        this.minBalance = minBalance;
    }

    public double getMinBalance() {
        return minBalance;
    }
}
