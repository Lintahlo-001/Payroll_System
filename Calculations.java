// Class that calculates the overall payroll / tax calculations
public class Calculations {
    // Method to calculate SSS (Social Security System) deduction based on salary
    public static double calculateSSS(double salary) 
    {
        double deductionSSS = 0;
        if (salary < 4250) 
            deductionSSS = 180;
        else if (salary <= 29750) 
        {
            int ranges = (int) Math.ceil((salary - 4250) / 500.0);
            deductionSSS = 180 + (ranges * 22.50);
        } 
        else 
            deductionSSS = 1350; 
        return deductionSSS;
    }

    // Method to calculate PhilHealth contribution based on salary
    public static double calculatePhilHealth(double salary)
    {
        double monthlyPremium = salary * 0.05; // Calculate the premium based on salary

        if (monthlyPremium <= 500) {
            return 250; // Minimum premium
        } else if (monthlyPremium > 5000) {
            return 2500; // Maximum premium
        } else {
            return monthlyPremium/2; 
        }
    }

    // Method to calculate Pag-Ibig contribution 
    // The employees that are using this program are direct contributors
    public static double calculatePagIbig(double salary){
        double pagibig;

        if (salary <= 1500) {
            pagibig = salary * 0.01; 
        } else {
            pagibig = salary * 0.02; 
        }
        if (salary > 10000) {
            pagibig = 200;
        }
        return pagibig; 
    }
    
    // Method to calculate taxable income by deducting contributions from gross income
    public static double calculateTaxableIncome(double grossIncome, double sss, double philHealth, double pagIbig){
        return grossIncome - (sss + philHealth + pagIbig);
    }

    // Method to calculate tax due based on taxable income using progressive tax rates
    public static double calculateTaxDue(double taxableIncome) 
    {
        double tax = 0;
        if (taxableIncome > 666667) 
            tax = 0.35 * (taxableIncome - 666667) + 183541.80;
        else if (taxableIncome > 166667) 
            tax = 0.3 * (taxableIncome - 166667) + 33541.80;
        else if (taxableIncome > 66667) 
            tax = 0.25 * (taxableIncome - 66667) + 8541.80;
        else if (taxableIncome > 33333) 
            tax = 0.2 * (taxableIncome - 33333) + 1875;
        else if (taxableIncome <= 20833) 
            tax = 0.00;
        else 
            tax = 0.15 * (taxableIncome - 20833);
        return tax;
    }
}