import java.util.Scanner;
public class Main {
    // User details
    static String name = "Jerry";
    static String account = "BO10006789";

    public static void printWelcome(){
        // Welcome to the BankApp
        System.out.println("Welcome " + name);
        System.out.println("Your current account is " + account);
    }

    public static void printMenu(){
        // Main Menu
        System.out.println(System.lineSeparator());
        System.out.println("********************");
        System.out.println("(W) Withdraw");
        System.out.println("(D) Deposit");
        System.out.println("(B) My Balance");
        System.out.println("(T) My Transactions");
        System.out.println("(E) Exit");
        System.out.println("********************");
    }
    public static void selectOption(){
        // Press a key to select an option
        try (Scanner scanner = new Scanner(System.in)) {
            char option;
            do {
                System.out.print("Select an option: ");
                option = (char) scanner.nextLine().trim().toUpperCase().charAt(0);
                switch (option) {
                    case 'E':
                        System.out.println("Exit...");
                        break;
                    default:
                        System.out.println(option + " is an invalid option");
                        break;
                }
                System.out.println(System.lineSeparator());
                System.out.println("(A) Show All options");
            } while (option != 'E');
        }
    }
    public static void main(String[] args) {
        // Welcome to the BankApp
        printWelcome();
        // Main Menu
        printMenu();
        // Press a key to select an option
        selectOption();

    }

}
