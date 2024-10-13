import java.io.*;
import java.util.*;

public class CSVHandler {
    public static ArrayList<Employee> readEmployeesFromCSV(String filename) {
        ArrayList<Employee> employees = new ArrayList<Employee>();

        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fields = line.split(",");

                String employeeID = fields[0];
                String name = fields[1];
                String birthDate = fields[2];
                String phoneNumber = fields[3];
                String address = fields[4];
                String pin = fields[5];
                String employeeType = fields[6];
                String hoursWorked = fields[7];
                String overtime = fields[8];
                String hourlyRate = fields[9];

                // Create a new Employee object based on the employee type
                Employee employee;
                if (employeeType.equals("Regular")) {
                    employee = new RegularEmployee();
                } else {
                    employee = new PartTimeEmployee();
                }

                // Assign fields to variables
                employee.setEmployeeID(employeeID);
                employee.setName(name);
                employee.setBirthDate(birthDate);
                employee.setPhoneNumber(phoneNumber);
                employee.setAddress(address);
                employee.setPin(pin);
                employee.setEmployeeType(employeeType);
                employee.setHoursWorked(hoursWorked);
                employee.setOvertime(overtime);
                employee.setHourlyRate(hourlyRate);

                // Adds the read employee object to the arraylist
                employees.add(employee);
            }
        } catch (FileNotFoundException e) {
            System.err.println("CSV file not found: " + filename);
        }
        return employees;
    }

   // Method to write employee to the CSV file
    public static void writeEmployeeToCSV(String filename, ArrayList<Employee> employees) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) { 
            for (Employee employee : employees) {
                String line = employeeToCSVLine(employee); // Convert the employee to a CSV line
                writer.println(line); // Write the employee's details to the CSV
            }
        } catch (IOException e) {
            System.err.println("Error writing to CSV file: " + filename);
        }
    }
    
    // Check Employee ID if it exists
    public static boolean checkEmployeeID(ArrayList<Employee> employees, String employeeID){
        boolean employeeFound = false;
        for (Employee employee : employees) {
            if (employee != null && employee.getEmployeeID().equals(employeeID)) {
                System.out.println("ID already exists. Please Try Again.\n");
                employeeFound = true;
                break;
            } 
        }
        return employeeFound;
    }

    // Convert employee object to a CSV line
    private static String employeeToCSVLine(Employee employee) {
        return employee.getEmployeeID() + "," + employee.getName() + "," +
            employee.getBirthDate() + "," + employee.getPhoneNumber() + "," +
            employee.getAddress() + "," + employee.getPin() + "," +
            employee.getEmployeeType() + "," + employee.getHoursWorked() + "," +
            employee.getOvertime() + "," + employee.getHourlyRate();
    }
}