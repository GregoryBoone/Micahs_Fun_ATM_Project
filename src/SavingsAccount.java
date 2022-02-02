public class SavingsAccount implements IAccount{
    // CheckingAccount checkObj = new CheckingAccount();

    private double balance, amount = 0;

    //setters and getters
    public void setBalance(double newBalance){
        this.balance = newBalance;
    }

    public double getBalance(){
        return balance;
    }

    public void setAmount(double newAmount){
        this.amount = newAmount;
    }

    public double getAmount(){
        return amount;
    }

    //general constructor
    SavingsAccount(){

    }


    @Override
    public void viewBalance() {
        System.out.println("Your savings account balance is " + getBalance());
    }

    @Override
    public double withdraw(double amount) {
        //unused in savings
        return amount;
    }

    @Override
    public double deposit(double amount) {
        this.amount = amount;
        balance += amount;
        return balance;
    }

    /*
    //@Override
    public void transfer(double savingsTransferAmount) {
        balance = getBalance();

        if(savingsTransferAmount > balance){
            System.out.println("Unable to transfer; insufficient funds.");
        }
        checkObj.deposit(savingsTransferAmount);

    } */
}
