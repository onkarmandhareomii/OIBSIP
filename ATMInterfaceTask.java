import java.util.ArrayList;
import java.util.Scanner;
public class Task3{
    private static double balance=1000.0;
    private static ArrayList<String>transactionHistory=new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choice;
        do{
            System.out.println("ATM MENU:");
            System.out.println("1.View Balance");
            System.out.println("2.Withdraw");
            System.out.println("3.Deposit");
            System.out.println("4.View Transaction History");
            System.out.println("5.Quit");
            System.out.println("Enter tour choice:");
            choice=scanner.nextInt();
            switch(choice){
                case 1:
                 viewBalance();
                 break;
                case 2:
                 withdraw(scanner);
                 break;
                case 3:
                 deposite(scanner);
                 break;
                case 4:
                 viewTransactionHistory();
                 break;
                case 5:
                 System.out.println("Thank you for using the ATM");
                 break;
                 default:
                 System.out.println("Invalid choice.Please try again");
            }

            }
            while(choice!=5);
    }
    public static void viewBalance(){
        System.out.println("Your account balance is:$+balance");
    }
    public static void withdraw(Scanner scanner){
        System.out.println("Enter the amount to withdraw:$");
        int amount=scanner.nextInt();
        if (amount>0&& amount<=balance) {
            balance-=amount;
            System.out.println("You have withdrawn$+amount");
            System.out.println("New balance:$+balance");
            addToTransactionHistory("withdreaw",amount);
        }else{
            System.out.println("insufficient funds.Your balance is $" + balance);
        }
    
    }
    public static void deposite(Scanner scanner){
        System.out.println("Enter the amount to deposite:$");
        int amount=scanner.nextInt();
        if (amount>0) {
            balance += amount;
            System.out.println("You have deposited:$"+ balance);
            addToTransactionHistory("Deposite",amount);


        }
        else{
            System.out.println("invalid amount.Please enter a positive value.");
        }

    }
    public static void 
    addToTransactionHistory(String type,int amount){
        String transaction=type + "of $"+ amount;
        transactionHistory.add(transaction);


    }
        public static void
        viewTransactionHistory(){
            System.out.println("TransactionHistory:");
            for(String transaction:transactionHistory)
            {
                System.out.println(transaction);
            }
        }


}