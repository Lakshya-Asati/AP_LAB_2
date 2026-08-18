class CurrentAccount extends BankAccount {
    private double overdraftLimit = 1000.0;

    public CurrentAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    public void withdraw(double amt) {
        if (amt > balance + overdraftLimit) {
            System.out.println("Error: Transaction exceeds overdraft limit.");
        } else {
            balance -= amt;
            System.out.println("Withdrawal successful from Current Account.");
        }
    }
}

