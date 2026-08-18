class SavingsAccount extends BankAccount {
    private double interestRate = 0.06;

    public SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }
    public void addInterest() {
        balance += balance * interestRate;
    }
    public void withdraw(double amt) {
        if (amt > balance) {
            System.out.println("Error: Insufficient Funds. Savings cannot go below 0.");
        } else {
            //balance += balance * interestRate;
            balance -= amt;
            System.out.println("Withdrawal successful from Savings Account.");
        }
    }
}
