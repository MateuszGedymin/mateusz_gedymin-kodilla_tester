package tooMuch;

public class Wallet {

    private int wallet = 0;

    public Wallet() {
    }

    public int getBankContent() {
        return wallet;
    }

    public void deposit(int amount) {
    wallet += amount;
    }

    public void withdraw(int amount) {
        if (wallet > amount) {
            wallet -= amount;
        }
    }
}
