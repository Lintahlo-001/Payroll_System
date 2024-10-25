import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Employee> employees = new ArrayList<Employee>();
    
    public static void main(String[] args) {
        employees = CSVHandler.readEmployeesFromCSV("employees.csv");
        main();
    }

    public static void main(){
        Display.title();
        while (true) {
            Display.mainMenu();
            System.out.print("Enter Choice: ");
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        EmployeeChoices.login(); // Pass the employee object to the login method
                        break;
                    case 2:
                        EmployeeChoices.register(); // Pass the employee object to the register method
                        break;
                    case 3:
                        System.out.println("Thank you for using the program.");
                        System.exit(0);
                    default:
                        System.out.println("\nInvalid Choice. Enter a number from 1-3.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid Choice. Enter a number.\n");
                scanner.nextLine();
            }
        } 
    }
    
}