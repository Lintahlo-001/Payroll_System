public class RegularEmployee extends Employee{

    protected String hourlyRate = "191.25";

    // Gross pay includes the hourly rate multiplied by total hours worked + overtime hours and a flat bonus
    public double calculateGrossPay() {
        return ((Double.parseDouble(getHourlyRate()) * (Integer.parseInt(hoursWorked))) + getOvertimePay() + flatRateBonus);
    }

    // Overtime is calculated at 1.5 times the hourly rate per hour of overtime
    public double getOvertimePay() {
        return Integer.parseInt(overtime) * 1.5 * (Double.parseDouble(getHourlyRate())); 
    }

    public double getBonus() {
        return flatRateBonus;
    }
}