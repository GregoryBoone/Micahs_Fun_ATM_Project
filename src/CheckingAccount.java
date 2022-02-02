public class CheckingAccount implements IAccount{
    //SavingsAccount saveObj = new SavingsAccount();

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
    CheckingAccount(){

    }


    @Override
    public void viewBalance() {
          System.out.println("Your checking account balance is " + getBalance());
    }

    @Override
    public double withdraw(double amount) {
        this.amount = amount;
        balance -= amount;

        if( amount > balance){
            System.out.println("Warning: Overdraft will occur.");
        }
        return balance;
    }

    @Override
    public double deposit(double amount) {
        this.amount = amount;
        balance += amount;
        return balance;
    }

    /*
    //@Override
    public void transfer(double checkingTransferAmount) {
        balance = getBalance();

        if(checkingTransferAmount > balance){
            System.out.println("Unable to transfer; insufficient funds.");
        }
        saveObj.deposit(checkingTransferAmount);

    } */
}
