import java.util.Scanner;

public class Employee {
    public static Scanner scanner = new Scanner(System.in);
    
    // Employee attributes
    protected String employeeID;                 // ID for each employee
    protected String name;                       // Employee's name
    protected String birthDate;                  // Employee's birth date
    protected String phoneNumber;                // Employee's contact number
    protected String address;                    // Employee's home address
    protected String pin;                        // Security PIN for employee login
    protected String employeeType;               // Type of employment (Regular or Part-time)
    protected String hoursWorked;                // Number of regular hours worked
    protected String overtime;                   // Number of overtime hours worked
    protected String hourlyRate;                 // Hourly wage rate based on employee type
    protected final double flatRateBonus = 1000; // Bonus amount provided to all employees

    // Getters and Setters 
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;

        if (employeeType.equals("Regular")) {
            this.hourlyRate = "191.25"; // Regular employee hourly rate
        } else if (employeeType.equals("Part-time")) {
            this.hourlyRate = "76.25"; // Part-time employee hourly rate
        }
    }

    public String getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(String hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getOvertime() {
        return overtime;
    }

    public void setOvertime(String overtime) {
        this.overtime = overtime;
    }

    public double getFlatRateBonus() {
        return flatRateBonus;
    }

    public String getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(String hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // Method to display employee details 
    public void employeeDetails() {
        System.out.println("\t\t\t\t\t\t\b\b\b\b\b╔════════════════════════════════════════════════════════════╗");
        System.out.println("\t\t\t\t\t\t\b\b\b\b\b║                      Employee Details                      ║");
        System.out.println("\t\t\t\t\t\t\b\b\b\b\b╚════════════════════════════════════════════════════════════╝");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b\b\b\b\b    Employee ID:        " + employeeID);
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b\b\b\b\b    Name:               " + name);
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b\b\b\b\b    Birth Date:         " + displayBirthDate(birthDate));
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b\b\b\b\b    Phone Number:       " + phoneNumber);
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b\b\b\b\b    Address:            " + address);
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b\b\b\b\b    PIN:                " + pin);
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b\b\b\b\b    Employee Type:      " + employeeType);
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b\b\b\b\b    Hours Worked:       " + hoursWorked);
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b\b\b\b\b    Overtime:           " + overtime);
        System.out.println();
    }

    // Adds formatting to the birth date
    public static String displayBirthDate(String birth) {
        StringBuilder birthday = new StringBuilder();
    
        for (int i = 0; i < 8; i++) {
            if (i == 2 || i == 4) {
                birthday.append("/");
            }
            birthday.append(birth.charAt(i));
        }
    
        return birthday.toString();
    }
}