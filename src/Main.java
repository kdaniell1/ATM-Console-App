import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pin = 1234;
        double balance = 5000;

        System.out.print("Enter PIN: ");
        int enteredPin = input.nextInt();

        if (enteredPin != pin) {
            System.out.println("Incorrect PIN. Exiting...");
            return;
        }

        System.out.println("***********************");
        System.out.println("     ATM MACHINE ");
        System.out.println("***********************");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");

        int option = input.nextInt();

        if (option == 1) {
            System.out.println("Your balance is: $" + balance);

        } else if (option == 2) {
            System.out.print("Enter amount to deposit: ");
            double depositAmount = input.nextDouble();
            balance += depositAmount;
            System.out.println("Deposit successful. New balance: $" + balance);

        } else if (option == 3) {
            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount = input.nextDouble();

            if (withdrawAmount > balance) {
                System.out.println("Insufficient funds.");
            } else {
                balance -= withdrawAmount;
                System.out.println("Withdrawal successful. New balance: $" + balance);
            }

        } else if (option == 4) {
            System.out.println("Thank you for using this ATM.");

        } else {
            System.out.println("Invalid option.");
        }
    }
}
