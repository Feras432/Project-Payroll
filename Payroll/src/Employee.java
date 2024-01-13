import java.util.Calendar;

public class Employee {
    private int employeeId;
    private String name;
    private String position;
    private double salary;
    private double bonus;
    private double overtime;
    private double deductions;
    public Calendar today;
    public double amount;
    public String payMethod;

    public Employee(int employeeId, String name, String position, double salary, double bonus, double overtime,
            double deductions) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.overtime = overtime;
        this.deductions = deductions;
        this.bonus = bonus;
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double SalaryCalc() {
        return salary + overtime + bonus - deductions;
    }

    public double addBonus(double bonus) {
        bonus = +salary;
        return bonus;

    }

    public void addOvertime(double overtime) {
        overtime = +salary;

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

}
