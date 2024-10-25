import java.util.*;

//  Class that handles employee-related choices
public class EmployeeChoices {
    public static Scanner scanner = new Scanner(System.in);
    private final static String filename = "employees.csv";

    public static void login() { // Log in method
        Employee loggedInEmployee;  
    
        while (true) {
            System.out.print("Enter Employee ID to login: ");   // Trimming any unnecessary whitespace
            String employeeID = scanner.nextLine();
    
            loggedInEmployee = findEmployeeByID(Main.employees, employeeID, filename); // Find the employee based on the provided Employee ID
     
            if (loggedInEmployee != null) {
                System.out.print("Enter Pin: ");
                String inputPassword = scanner.nextLine();
    
                if (loggedInEmployee.getPin().equals(inputPassword)) {
                    System.out.println("\n==================================================================================================================");
                    System.out.println("\nLogin successful! Welcome Back, " + loggedInEmployee.getName());
                    EmployeeChoices.userMenu(loggedInEmployee, filename);
                    break; 
                } else {
                    System.out.println("Incorrect password. Please try again.\n");
                    break;
                }
            } else {
                System.out.println("Employee ID not found. Please try again.\n");
                break;
            }
        }
    }

    public static void register() {
            Employee employee;
            String hourlyRate;

            System.out.println("\n==================================================================================================================");
            System.out.println("Please complete the following\n");

            // Instantiate the appropriate employee type and set the hourly rate
            String employeeTypeInput = ValidateInput.getEmployeeType("Employee Type");
            if (employeeTypeInput.equals("Regular")) {
                employee = new RegularEmployee();
                hourlyRate = "191.25";
            } else {
                employee = new PartTimeEmployee();
                hourlyRate = "76.25";
            }
            // Collect employee details from user input
            employee.setEmployeeID(ValidateInput.getEmployeeID("Employee ID"));
            employee.setName(ValidateInput.getStringInput("Full Name"));
            employee.setBirthDate(ValidateInput.getBirthDate("Birth Date"));
            employee.setPhoneNumber(ValidateInput.getPhoneNumber("Phone Number"));
            employee.setAddress(ValidateInput.getAddress("Address"));
            employee.setPin(ValidateInput.getPinNumber("PIN Number"));
            employee.setEmployeeType(employeeTypeInput);
            employee.setHoursWorked(ValidateInput.inputHoursWorked("Hours Worked"));
            employee.setOvertime(ValidateInput.inputOvertime("Overtime Hours Worked"));
            employee.setHourlyRate(hourlyRate);

            // Adds employee object to the arraylist
            Main.employees.add(employee);
            CSVHandler.writeEmployeeToCSV(filename, Main.employees); // Append Values to CSV file
            Display.displayPayroll(employee); // Display payroll

    }

    // User Menu method that displays options for logged-in employees
    public static void userMenu(Employee loggedInEmployee, String filename) { 

        while (true) {
            Display.loginOptions(); // Display login options to the user
            try {
                System.out.print("Enter Choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        loggedInEmployee.employeeDetails(); // Display employee details
                        break;
                    case 2:
                        Display.displayPayroll(loggedInEmployee); // Display payroll details
                        break;
                    case 3:
                        EmployeeChoices.editMenu(loggedInEmployee, filename); // Open edit menu
                        break;
                    case 4:
                        deleteAccount(loggedInEmployee); // Calls method for deleting employee
                    case 5:
                        Main.main();
                        break;
                    case 6:
                        System.out.println("Thank you for using the program.");
                        System.exit(0);
                    default:
                        System.out.println("\nInvalid Choice. Enter a number from 1-6.\n");
                }
            } catch (Exception e) {
                System.out.println("\nInvalid Choice. Enter a number.\n");
                scanner.nextLine(); 
            }
        }
    }

    // Edit menu method that allows employees to modify their details
    public static void editMenu(Employee loggedInEmployee, String filename) { 
        while (true) {
            Display.editOption();
            try {
                System.out.print("Enter Choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        editDetails(loggedInEmployee, "Name", filename);
                        break;
                    case 2:
                        editDetails(loggedInEmployee, "Birth Date", filename);
                        break;
                    case 3:
                        editDetails(loggedInEmployee, "Phone Number", filename);
                        break;
                    case 4:
                        editDetails(loggedInEmployee, "Address", filename);
                        break;
                    case 5:
                        editDetails(loggedInEmployee, "PIN", filename);
                        break;
                    case 6:
                        editDetails(loggedInEmployee, "Employee Type", filename);
                        break;
                    case 7:
                        editDetails(loggedInEmployee, "Hours Worked", filename);
                        break;
                    case 8:
                        editDetails(loggedInEmployee, "Overtime", filename);
                        break;
                    case 9:
                        userMenu(loggedInEmployee, filename);
                        break;
                    case 10:
                        Main.main();
                        break; 
                    case 11:
                        System.out.println("Thank you for using the program.");
                        System.exit(0);
                    default:
                        System.out.println("\nInvalid Choice. Enter a number from 1-11.\n");
                }
            } catch (Exception e) {
                System.out.println("\nInvalid Choice. Enter a number.\n");
                scanner.nextLine(); 
            }
        }
    }

    // Method to edit specific details of the logged-in employee
    public static void editDetails(Employee loggedInEmployee, String option, String filename) {
        switch (option) {
            case "Name":
                loggedInEmployee.setName(ValidateInput.getStringInput("Full Name"));
                break;
            case "Birth Date":
                loggedInEmployee.setBirthDate(ValidateInput.getBirthDate("Birth Date"));
                break;
            case "Phone Number":
                loggedInEmployee.setPhoneNumber(ValidateInput.getPhoneNumber("Phone Number"));
                break;
            case "Address":
                loggedInEmployee.setAddress(ValidateInput.getAddress("Address"));
                break;
            case "PIN":
                loggedInEmployee.setPin(ValidateInput.getPinNumber("PIN Number"));
                break;
            case "Employee Type":
                loggedInEmployee.setEmployeeType(ValidateInput.getEmployeeType("Employee Type"));
                break;
            case "Hours Worked":
                loggedInEmployee.setHoursWorked(ValidateInput.inputHoursWorked("Hours Worked"));
                break;
            case "Overtime":
                loggedInEmployee.setOvertime(ValidateInput.inputOvertime("Overtime Hours Worked"));
                break;
            default:
                System.out.println("Invalid option.");
                return;
        }
        CSVHandler.writeEmployeeToCSV(filename, Main.employees); // Update the employee in the CSV
    }
    
    // Method to find an employee by ID in the employee array
    public static Employee findEmployeeByID(ArrayList<Employee> employees, String employeeID, String filename) {
        for (Employee employee : employees) {
            if (employee.getEmployeeID().equals(employeeID)) {
                return employee; 
            }
        }
        return null; 
    }

    // Method to delete employee
    public static void deleteAccount(Employee employee) {
        String confirm;
        while (true) {
            try {
                System.out.print("\nDelete Employee? Are you sure? [Y/N]: "); confirm = scanner.nextLine();
                if (confirm.toLowerCase().equals("y")) {
                    for (int i = 0; i < Main.employees.size(); i++) {
                        Employee temp = Main.employees.get(i);
                        if (temp.getEmployeeID().equals(employee.employeeID)) {
                            Main.employees.remove(i);
                            System.out.println("Account Deleted.");
                            System.out.println();
                            CSVHandler.writeEmployeeToCSV(filename, Main.employees);
                            Main.main();
                        }
                    }
                } else if (confirm.toLowerCase().equals("n")) {
                    userMenu(employee, filename);
                } else {
                    System.out.println("Invalid Input.");
                }

            } catch (Exception e) {
                System.out.println("Invalid Input.");
            }
        }
    }
}