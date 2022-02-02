import java.util.Scanner;

public class MenuOptions{
    CheckingAccount checkObj = new CheckingAccount();
    SavingsAccount saveObj = new SavingsAccount();
    Scanner input = new Scanner(System.in);

    void userNamePassWord(String userName, int PIN){
        while(userName.equals("Micah") && PIN == 12345){
            System.out.println("Access granted.  Welcome."); break;
        }

        if(!userName.equals("Micah") && PIN != 12345){
            System.out.println("Incorrect username or password.");
            System.exit(0);
        }



    }

    void checkingOptions(int checkingSelect){
        switch(checkingSelect){
            case 1: checkObj.viewBalance(); break;
            case 2: System.out.println("Enter withdrawal amount: ");
                    double withdrawalAmount = input.nextDouble();
                    checkObj.withdraw(withdrawalAmount); break;
            case 3: System.out.println("Enter deposit amount: ");
                    double depositAmount = input.nextDouble();
                    checkObj.deposit(depositAmount); break;

            /*
            case 4: System.out.println("Enter transfer amount");
                    double checkingTransferAmount = input.nextDouble();
                    checkObj.transfer(checkingTransferAmount); break; */
        }
    }

    void savingsOptions(int savingSelect){
        switch(savingSelect){
            case 1: saveObj.viewBalance(); break;
            case 2: System.out.println("Unable to withdraw directly from savings.  Please transfer to checking account first.");
                    //double withdrawalAmount = input.nextDouble();
                    //saveObj.withdraw(withdrawalAmount);
                    break;
            case 3: System.out.println("Enter deposit amount: ");
                    double depositAmount = input.nextDouble();
                    saveObj.deposit(depositAmount); break;

            /*
            case 4: System.out.println("Enter transfer amount");
                    double savingsTransferAmount = input.nextDouble();
                    saveObj.transfer(savingsTransferAmount); break; */
        }
    }
}
