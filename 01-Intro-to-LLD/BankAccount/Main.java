package BankAccount;

import BankAccount.enums.AccountType;
import BankAccount.model.Account;

public class Main {
    public static void main(String[] args) {
        Account a1 = new Account(AccountType.SAVINGS);
        a1.deposit(1000);
        a1.withdraw(300); // Remaining: 700 (Valid, min is 500)
        System.out.println("Acc #" + a1.getAccountNumber() + " | " + a1.getAccountType() + " | Balance: " + a1.getBalance());

        Account a2 = new Account(AccountType.CURRENT);
        a2.deposit(2000);
        a2.withdraw(500); // Remaining: 1500 (Valid, min is 1000)
        System.out.println("Acc #" + a2.getAccountNumber() + " | " + a2.getAccountType() + " | Balance: " + a2.getBalance());
    }
}
