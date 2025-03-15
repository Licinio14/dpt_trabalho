package Views;

import Controllers.LoginController;
import Tools.Colors;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoginView {
    LoginController loginController;

    public LoginView() throws FileNotFoundException {
        this.loginController = new LoginController();
    }

    public void loginMenu() throws FileNotFoundException, InterruptedException {
        int loginOption;

        do {

            System.out.println("Welcome to CesaeLand©");
            System.out.println("1. Customer");
            System.out.println("2. Staff Member");
            System.out.println("0. Exit");
            System.out.print("Choose:");

            loginOption = Tools.InputTools.getInputInt();

            switch (loginOption){
                case 1: // Customer
                    Colors.Clear();
                    CustomerView customerView = new CustomerView();
                    customerView.customerMenu();
                    break;
                case 2: // staff Member
                    Colors.Clear();

                    System.out.println("\nLogin with your cradentials");
                    System.out.print("Username: ");
                    String usernameInput = Tools.InputTools.getInputString();

                    System.out.print("Password: ");
                    String passwordInput = Tools.InputTools.getInputString();

                    validateLogin(usernameInput,passwordInput);

                    break;
                case 0:

                    break;
                default: // invalid option
                    Colors.Clear();
                    System.out.println(Colors.RED +  "Invalid option!\n" + Colors.RESET);
                    break;
            }
        }while (loginOption != 0);
    }

    private void validateLogin(String usernameInput, String passwordInput) throws InterruptedException, FileNotFoundException {
        String access = loginController.accessType(usernameInput,passwordInput);

        switch (access){
            case "ADMIN":
                Colors.Clear();
                AdminView adminView = new AdminView();
                adminView.adminMenu();
                System.out.println("Admin logged in");
                break;
            case  "ENG":
                Colors.Clear();
                EngineerView engineerView = new EngineerView();
                engineerView.engineerMenu();
                break;
            case  "ERROR":
                Colors.Clear();
                System.out.println(Colors.RED +  "Invalid Credentials" + Colors.RESET);
                break;
        }
    }
}
