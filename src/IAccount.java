public interface IAccount {
    double balance = 0, amount = 0;

    void viewBalance();
    public double withdraw(double amount);
    public double deposit(double amount);
    //void transfer(double balance);
}
