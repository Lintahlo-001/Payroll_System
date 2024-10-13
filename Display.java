import java.text.DecimalFormat;

// Class containing the title & menu display
public class Display{   
    static DecimalFormat df = new DecimalFormat("#,##0.00");

    // Method to print the title of the application
    public static void title() {
        System.out.println("\r\n\t\t\t\t\t\b\b\b╔═════════════════════ | ═══════════════════════════ | ═════════════════════╗");
        System.out.println("\r\n" + //
                "\t\t\t\t\t\b\b\b    ██╗  ██╗ █████╗  █████╗ ████████╗██╗     ██╗███╗  ██╗ ██████╗  █████╗ \r\n" + 
                "\t\t\t\t\t\b\b\b    ██║  ██║██╔══██╗██╔══██╗╚══██╔══╝██║     ██║████╗ ██║██╔════╝ ██╔══██╗\r\n" + 
                "\t\t\t\t\t\b\b\b    ███████║██║  ██║██║  ██║   ██║   ██║     ██║██╔██╗██║██║  ██╗ ██║  ██║\r\n" + 
                "\t\t\t\t\t\b\b\b    ██╔══██║██║  ██║██║  ██║   ██║   ██║     ██║██║╚████║██║  ╚██╗██║  ██║\r\n" + 
                "\t\t\t\t\t\b\b\b    ██║  ██║╚█████╔╝╚█████╔╝   ██║   ███████╗██║██║ ╚███║╚██████╔╝╚█████╔╝\r\n" + 
                "\t\t\t\t\t\b\b\b    ╚═╝  ╚═╝ ╚════╝  ╚════╝    ╚═╝   ╚══════╝╚═╝╚═╝ ╚══╝ ╚═════╝╚════╝ ");
        System.out.println("\n\t\t\t\t\t\b\b\b╚═════════════════════ | PAYROLL CALCULATION SYSTEM | ═════════════════════╝\n");
    }

    // Method to display the main menu options
    public static void mainMenu(){
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b╔════════════════════════════╗");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b║          Main Menu         ║");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b╠════════════════════════════╣");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b║ 1. Log in                  ║");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b║ 2. Register                ║");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b║ 3. Exit                    ║");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b╚════════════════════════════╝\n");
    }

    // Method to display login options for the user
    public static void loginOptions(){
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b╔════════════════════════════╗");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b║            Menu            ║");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b╠════════════════════════════╣");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b║ 1. User Details            ║");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b║ 2. Payroll Calculation     ║");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b║ 3. Edit User Details       ║");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b║ 4. Delete Employee         ║");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b║ 5. Log out                 ║");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b║ 6. Exit                    ║");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b╚════════════════════════════╝\n");
    }

    // Method to display the edit options for user details
    public static void editOption(){
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b╔════════════════════════════╗");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b║          Edit Menu         ║");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b╠════════════════════════════╣");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b║ 1. Name                    ║");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b║ 2. Birth Date              ║");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b║ 3. Phone Number            ║");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b║ 4. Address                 ║");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b║ 5. PIN                     ║");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b║ 6. Employee Type           ║");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b║ 7. Hours Worked            ║");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b║ 8. Overtime                ║");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b║ 9. Return to User Menu     ║");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b║ 10. Log out                ║");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b║ 11. Exit                   ║");
        System.out.println("\t\t\t\t\t\t\t\t\b\b\b\b╚════════════════════════════╝\n");
    }

    // Method to display payroll deductions
    public static void displayDeductions(double grossIncome, double sss, double philhealth, double pagibig, double taxableIncome, double taxDue)
    {
        double totalContributions = sss + pagibig + philhealth;
        System.out.println("\t\t\t\t\t ╔═══════════════════════════════════════════════════════════════════╗"); 
        System.out.println("\t\t\t\t\t ║                        Payroll Calculation                        ║");
        System.out.println("\t\t\t\t\t ╠═══════════════════════════════════════════════════════════════════╣"); 
        System.out.println("\t\t\t\t\t ║\tMonthly Bonus: \t\t\t\tPhp 1,000\t\t\b\b\b\b ║");
        System.out.println("\t\t\t\t\t ║\tGross Income: \t\t\t\tPhp " + df.format(grossIncome) + "\t\t\b\b\b\b ║");
        System.out.println("\t\t\t\t\t ║\t\t\t\t\t\t\t\t\t\b\b\b\b ║");
        System.out.println("\t\t\t\t\t ║\tSSS: \t\t\t\t\tPhp "+df.format(sss) + "\t\t\b\b\b\b ║");
        System.out.println("\t\t\t\t\t ║\tPhilHealth: \t\t\t\tPhp "+ df.format(philhealth) + "\t\t\b\b\b\b ║");
        System.out.println("\t\t\t\t\t ║\tPag-ibig: \t\t\t\tPhp " + df.format(pagibig) + "\t\t\b\b\b\b ║");
        System.out.println("\t\t\t\t\t ║\t\t\t\t\t\t\t\t\t\b\b\b\b ║");
        System.out.println("\t\t\t\t\t ║\tTotal Contributions: \t\t\tPhp "+ df.format(totalContributions) + "\t\t\b\b\b\b ║");
        System.out.println("\t\t\t\t\t ║\t\t\t\t\t\t\t\t\t\b\b\b\b ║");
        System.out.println("\t\t\t\t\t ║\tTaxable Income: \t\t\tPhp " + df.format(taxableIncome) + "\t\t\b\b\b\b ║");
        System.out.println("\t\t\t\t\t ║\tTax Due: \t\t\t\tPhp "+ df.format(taxDue)+ "\t\t\b\b\b\b ║");
        System.out.println("\t\t\t\t\t ║\t\t\t\t\t\t\t\t\t\b\b\b\b ║");
        System.out.println("\t\t\t\t\t ║\tNet Income: \t\t\t\tPhp "+ df.format(taxableIncome - taxDue) + "\t\t\b\b\b\b ║");
        System.out.println("\t\t\t\t\t ╚═══════════════════════════════════════════════════════════════════╝\n"); 
    }

    // Method to display payroll information for an employee
    public static void displayPayroll(Employee employee) {
        double grossIncome;

        if (employee instanceof RegularEmployee) {
            RegularEmployee regularEmployee = (RegularEmployee) employee;
            // Use the already stored hours worked and rate to calculate gross pay
            grossIncome = regularEmployee.calculateGrossPay();
            
        } else if (employee instanceof PartTimeEmployee) {
            PartTimeEmployee partTimeEmployee = (PartTimeEmployee) employee;
            // Use the already stored hours worked and rate to calculate gross pay
            grossIncome = partTimeEmployee.calculateGrossPay();
           
        } else {
            System.out.println("Unknown employee type.");
            return;
        }

        // Calculate and display deductions (SSS, PhilHealth, Pag-ibig, Taxable Income, & Tax due.)
        double sss = Calculations.calculateSSS(grossIncome);
        double philHealth = Calculations.calculatePhilHealth(grossIncome);
        double pagIbig = Calculations.calculatePagIbig(grossIncome);
        double taxableIncome = Calculations.calculateTaxableIncome(grossIncome, sss, philHealth, pagIbig);
        double taxDue = Calculations.calculateTaxDue(taxableIncome);

        displayDeductions(grossIncome, sss, philHealth, pagIbig, taxableIncome, taxDue);    // Display all deductions
    }
}