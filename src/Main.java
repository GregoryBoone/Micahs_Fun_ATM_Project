import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        MenuOptions menuObj = new MenuOptions();
        CheckingAccount checkObj = new CheckingAccount();
        SavingsAccount saveObj = new SavingsAccount();

        System.out.println("Welcome to Micah's Fun ATM!");
        System.out.println("Please enter your name and PIN");
        String userName = input.nextLine();
        int PIN = input.nextInt();

        menuObj.userNamePassWord(userName, PIN);

        //menuOptions

            System.out.println("Choose from the following options:");
            System.out.println("1. Checking Options " + System.lineSeparator() + "2. Savings Options " + System.lineSeparator() + "3. Exit");

            int optionSelect = input.nextInt();

            //user input goes to menu options
            //menuObj.startOptions(optionSelect);

            //checking options
            while(optionSelect == 1){
                System.out.println("Checking Options");
                System.out.println("1. View Balance" + System.lineSeparator() + "2. Withdraw" + System.lineSeparator() + "3. Deposit" + System.lineSeparator() /* +  "4. Transfer funds" */ );

                int checkingSelect = input.nextInt();
                menuObj.checkingOptions(checkingSelect);

            }

            while(optionSelect == 2){
            System.out.println("Savings Options");
            System.out.println("1. View Balance" + System.lineSeparator() + "2. Withdraw" + System.lineSeparator() + "3. Deposit" + System.lineSeparator() /* + "4. Transfer funds"*/ );

            int savingsSelect = input.nextInt();
            menuObj.savingsOptions(savingsSelect);

           }

           while(optionSelect == 3){
               System.out.println("Thank you for using Micah's Fun ATM.  Have a nice day!");

               //exit program
               System.exit(0); break;
           }
    }
}
