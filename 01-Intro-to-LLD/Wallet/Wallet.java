public class Wallet {
    private double balance;

    public double getBalance() {
        return balance;
    }
    
    public void addMoney(double amount) { 
        if (amount <= 0) throw new IllegalArgumentException("Bad Amount");

        balance += amount;
    }

    public void pay(double amount) {
        if (amount > balance) throw new IllegalArgumentException("Low balance");

        balance -= amount;
    }
}