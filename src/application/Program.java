package application;

import model.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data: ");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        Double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();
        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount to withdraw: ");
        Double amount = sc.nextDouble();

        String error = account.withdraw(amount);
        if (error != null) {
            System.out.println("Withdraw error: " + error);
        } else {
            System.out.printf("New balance: %.2f%n", account.getBalance());
        }

        sc.close();
    }
}
