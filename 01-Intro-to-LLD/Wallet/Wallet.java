public class Wallet {
    private double balance;

    public double getBalance() {
        return balance;
    }
    
    public void addMoney(double amount) { 
        if (amount <= 0) {
            throw new IllegalArgumentException("Bad Amount");
        }
        balance += amount;
    }

    public void pay(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Bad Amount");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Low balance");
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        Wallet myWallet = new Wallet();
        
        myWallet.addMoney(500);
        System.out.println("Balance after adding: " + myWallet.getBalance());
        
        myWallet.pay(120);
        System.out.println("Balance after paying: " + myWallet.getBalance());
    }
}
