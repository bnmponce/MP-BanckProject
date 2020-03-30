package org.example;

import java.util.Scanner;
public class Menus{
    String name ;
    String account;

    public void printWelcome(String name, String account){

        BankAccount bankAccount = new BankAccount(name, account);
        // Welcome to the BankApp
        System.out.println("Welcome " + this.name);
        System.out.println("Your current account is " + this.account);
        // Main Menu
        printMenu();
        // Press a key to select an option
        selectOption(bankAccount);
    }

    public void printMenu(){
        // Main Menu
        System.out.println(System.lineSeparator());
        System.out.println("********************");
        System.out.println("(A) Show all options");
        System.out.println("(W) Withdraw");
        System.out.println("(D) Deposit");
        System.out.println("(B) My Balance");
        System.out.println("(T) My Transactions");
        System.out.println("(E) Exit");
        System.out.println("********************");
    }

    public void selectOption(BankAccount bankAccount){
        // Press a key to select an option
        try (Scanner scanner = new Scanner(System.in)) {
            boolean closeApp=true;
            char option;
            while (true){
                System.out.print("Select an option: ");
                option = getSelectOption(scanner) ;
                switch (option) {
                    case 'A':
                        printMenu();
                        break;
                    case 'E':
                        System.out.println("Exit...");
                        closeApp=false;
                        break;
                    case 'W':
                        bankAccount.withdraw();
                        break;
                    default:
                        System.out.println(option + " is an invalid option");
                        break;
                    //Is running

                }
                if (closeApp){
                    break;
                }

                System.out.println("(A) Show All options");
            }
        }
    }
    private char getSelectOption(Scanner scanner){
        return scanner.nextLine().trim().toUpperCase().charAt(0);
    }
}
