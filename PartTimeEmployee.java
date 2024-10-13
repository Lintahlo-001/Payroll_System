public class PartTimeEmployee extends RegularEmployee {

    // Part-time employee has a different hourly rate from regular employees
    protected String hourlyRate = "76.25";  

    @Override
    // Gross pay includes the hourly rate multiplied by total hours worked + overtime hours and a flat bonus
    public double calculateGrossPay() {
        return ((Double.parseDouble(getHourlyRate()) * (Integer.parseInt(hoursWorked))) + getOvertimePay() + flatRateBonus);
    }

    @Override
    // Overtime is calculated at 1.5 times the hourly rate per hour of overtime
    public double getOvertimePay() {
        return Integer.parseInt(overtime) * 1.5 * (Double.parseDouble(getHourlyRate()));    
    }

    @Override
    public double getBonus() {
        return flatRateBonus; 
    }
}