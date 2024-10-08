package Mypack;

import java.util.*;

public class Bank
{

    public void BankSystem() {

        Scanner in = new Scanner(System.in);
        int accno = 0;
        String name = null;
        int choice;
        boolean quit = false;
        float balance = 0f;

        do {
            System.out.println("1. Open Account.");
            System.out.println("2. Deposit Money.");
            System.out.println("3. Withdraw Money.");
            System.out.println("4. Display Account Details.");
            System.out.println("0. To Quit !");
            System.out.println("\nEnter your choice: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Account No. : ");
                    accno = in.nextInt();
                    System.out.println("Enter Name : ");
                    name = in.next();
                    System.out.println("Enter Balance: ");
                    balance = in.nextFloat();
                    break;

                case 2:
                    float amount;
                    System.out.println("Amount to Deposit : ");
                    amount = in.nextFloat();
                    balance += amount;
                    System.out.println("! Successfully Rs." + amount + " has been Deposited !");
                    break;

                case 3:
                    System.out.println("Amount to Withdraw : ");
                    amount = in.nextFloat();
                    if (amount > balance) {
                        System.out.println("Less Balance... Transaction Failed");
                    } else {
                        balance -= amount;
                        System.out.println("! Successfully Rs." + amount + " has been Withdrawn !");
                    }
                    break;

                case 4:
                    System.out.println("ACCOUNT NO :" + accno);
                    System.out.println("NAME :" + name);
                    System.out.println("BALANCE AMOUNT : Rs." + balance);
                    break;

                case 0:
                    quit = true;
                    break;

                default:
                    System.out.println("~! You Entered Wrong Choice! ~");
                    break;
            }

            System.out.println();

        } while (!quit);
    }
}
