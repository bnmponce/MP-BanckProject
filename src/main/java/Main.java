import org.example.Menus;
public class Main {

    public static void main(String[] args) {
        // Welcome to the BankApp
        Menus menu = new Menus("Jerry", "BO10006789");
        menu.printWelcome();
        // Main Menu
        menu.printMenu();
        // Press a key to select an option
        menu.selectOption();

    }

}
