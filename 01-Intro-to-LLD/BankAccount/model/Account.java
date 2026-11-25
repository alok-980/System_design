package BankAccount.model;

import BankAccount.enums.AccountType;

public class Account {
    private static int counter = 0;
    private final int accountNumber;
    private AccountType accountType;
    private double balance;

    public Account(AccountType accountType) {
        ++counter;
        this.accountNumber = counter;
        this.accountType = accountType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Bad Amount");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Bad Amount");
        }
        if (balance - amount < accountType.getMinBalance()) {
            throw new IllegalArgumentException("Cannot go below minimum balance of " + accountType.getMinBalance());
        }
        balance -= amount;
    }
}
