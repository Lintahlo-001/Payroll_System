import java.util.Scanner;

// Class to validate user inputs based on given requirements
public class ValidateInput { 
    public static Scanner scanner = new Scanner(System.in);

    public static String getEmployeeID(String requirement) {
        String input;
        while (true) {
            System.out.print("Enter " + requirement + " [8 digits]: ");
            input = scanner.nextLine();
    
            // Check if the input is valid before proceeding
            if (input.matches("[0-9]+") && input.length() == 8) {
                if(CSVHandler.checkEmployeeID(Main.employees, input)) {
                    continue;
                }
                return input; // Return valid input
            } else if (!input.matches("[0-9]+")) {
                System.out.println("Invalid Input. Please Enter Only Numerical Digits.\n");
            } else if (input.length() != 8) {
                System.out.println("Invalid Input. Please Enter Exactly 8 Numbers.\n");
            }
        }
    }
    
    public static String getStringInput(String requirement) {
        String input;
        while (true) {
            System.out.print("Enter " + requirement + ": ");
            input = scanner.nextLine();
            if (input.matches("[a-zA-Z\\s\\.]+")) {
                return input;
            } else {
                System.out.println("Invalid Input. Please Enter Only Alphabetical Characters.\n");
            }
        }
    }

    public static String getPhoneNumber(String requirement) {
        String input;
        while (true) {
            System.out.print("Enter " + requirement + ": ");
            input = scanner.nextLine();
            if (input.matches("[0-9]+") && input.length() == 11) {
                return input;
            } else if (!input.matches("[0-9]+")) {
                System.out.println("Invalid Input. Please Enter Only Numerical Digits.\n");
            } else if (input.length() != 11) {
                System.out.println("Invalid Input. Please Enter Exactly 11 Numbers.\n");
            }
        }
    }

    public static String getBirthDate(String requirement) {
        String input;
        while (true) {
            System.out.print("Enter " + requirement + " (DD/MM/YYYY): ");
            input = scanner.nextLine();
            if (input.matches("[0-9]+") && input.length() == 8) {
                return input;
            } else if (!input.matches("[0-9]+")) {
                System.out.println("Invalid Input. Please Enter Only Numerical Digits.\n");
            }  else if (input.length() != 8) {
                System.out.println("Invalid Input. Please Enter Exactly 8 Numbers\n");
            }
        }
    }

    public static String getAddress(String requirement){
        while (true) {
            System.out.print("Enter " + requirement + ": ");
            return scanner.nextLine();
        }
    }

    public static String getPinNumber(String requirement) {
        String pin;
        while (true) {
            System.out.print("Enter your PIN number (4 digits): ");
            pin = scanner.nextLine();
            if (pin.matches("[0-9]+") && pin.length() == 4) {
                if (confirmPin(pin)) { // Call confirmPin method and check if it matches
                    break;
                } else {
                    System.out.println("PIN confirmation failed. Please try again.\n");
                }
            } else {
                System.out.println("Invalid Input. Please Enter Exactly 4 Numerical Digits.\n");
            }
        }
        return pin;
    }

    public static boolean confirmPin(String pin) {
        while (true) {
            System.out.print("Confirm your PIN: ");
            String finalPin = scanner.nextLine();
            if (pin.equals(finalPin)) {
                System.out.println("PIN Successfully Created!");
                return true;
            } else {
                return false; 
            }
        }
    }

    public static String getEmployeeType(String requirement) {
        String input;
        while (true) {
            System.out.print("Enter Employee Type [1 for Regular, 2 for Part-time]: ");
            input = scanner.nextLine();
            if (input.equals("1")) {
                return "Regular";
            } else if (input.equals("2")) {
                return "Part-time";
            } else {
                System.out.println("Invalid Input. Please enter 1 for Regular or 2 for Part-time.\n");
            }
        }
    }

    public static String inputHoursWorked(String requirement) {
        while (true) {
            System.out.print("\nEnter Hours Worked: ");
            String inputHours = scanner.nextLine(); 
            try {
                int number = Integer.parseInt(inputHours); 
                if (number >= 40 && number <= 160) { // Minimum and Maximum hours
                    return inputHours; 
                } else {
                    System.out.println("Invalid input. Please enter a number between 40 to 160.");
                }
            } catch (NumberFormatException e) { // Catch invalid number formats
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    public static String inputOvertime(String requirement) {
        while (true) {
            System.out.print("Enter Overtime Worked: ");
            String overtime = scanner.nextLine(); 
            try {
                double number = Double.parseDouble(overtime); 
                if (number >= 0 && number <= 60) { // Minimum and Maximum overtime hours
                    return overtime; 
                } else {
                    System.out.println("Invalid input. Please enter a non-negative number between 0 to 220.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    public static String getHourlyRate(String requirement){
        return requirement;
    }
}