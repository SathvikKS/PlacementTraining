import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM {
    public static int balance = 25000;
    public static void depositMoney(int n) {
        balance+=n;
        System.out.println("Amount has been deposited. Your current account balance is: Rs. "+balance);
    }
    public static void withdrawMoney(int n) {
        if (n>balance) {
            System.out.println("Insufficient balance");
            return;
        }
        balance-=n;
        System.out.println("Please collect your money. Your current account balance is: Rs. "+balance);
    }
    public static void checkBalance() {
        System.out.println("Your account balance is: Rs. "+balance);
    }
    public static void main(String[] args) {
        int choice, n;
        String ch;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("\nAutomated Teller Machine\nChoose 1 for Withdraw\nChoose 2 for Deposit\nChoose 3 for Check Balance\nChoose 4 for EXIT\nChoose the operation you want to perform: ");
            ch = sc.next();
            if (ch.matches("^[0-9]+$")) {
                choice = Integer.parseInt(ch);
                switch (choice) {
                    case 1:
                        System.out.print("Enter the amount to withdraw: ");
                        n = sc.nextInt();
                        withdrawMoney(n);
                        break;
                    case 2:
                        System.out.print("Enter the amount to deposit: ");
                        n = sc.nextInt();
                        depositMoney(n);
                        break;
                    case 3:
                        checkBalance();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("\nInvalid choice");
                }
            } else {
                System.out.println("Enter integer choice only");
            }
        }
    }
}
