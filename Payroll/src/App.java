import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Employee john = new Employee(110, "John", "Manager", 2200, 1000, 750, 250);
        Employee kevin = new Employee(111, "Kevin", "programmer", 1400, 600, 350, 50);
        john.SalaryCalc();
        kevin.SalaryCalc();

        LocalDate localDate = LocalDate.of(2024, 1, 3);
        LocalDate yesterdayDate = localDate.plusDays(4);
        LocalDate localDate1 = LocalDate.of(2023, 4, 15);
        LocalDate dayBefore = localDate1.minusDays(10);

        PaymentHistory yesterday = new PaymentHistory(1000, "card");
        PaymentHistory yesterday1 = new PaymentHistory(800, "card");

        System.out.println("Employeee " + john.getName() + " has Id number " + john.getEmployeeId()
                + " and has this monthly salary: " + john.getSalary());

        System.out.println("Employeee " + kevin.getName() + " has Id number " + kevin.getEmployeeId()
                + " and has this monthly salary: " + kevin.getSalary());

        System.out.println("The salary with the bonus and the overtime minus the deductions for " + john.getName()
                + " is " + john.SalaryCalc());
        System.out.println("The salary with the bonus and the overtime minus the deductions for " + kevin.getName()
                + " is " + kevin.SalaryCalc());

        System.out.println(
                "The employee " + john.getName() + " has made a payment using " +
                        yesterday.getPayMethod() + " and has made it on the day of " + yesterdayDate
                        + " and the amount was "
                        + yesterday.getAmount());
        System.out.println(
                "The employee " + kevin.getName() + " has made a payment using " +
                        yesterday.getPayMethod()
                        + " and has made it on the day of " + dayBefore + " and the amount was "
                        + yesterday1.getAmount());
    }
}
