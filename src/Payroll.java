/*
A program is required by a company to read an employee’s number, pay rate and the number of hours
worked in a week. The program is then to validate the pay rate field and the hours worked field and,
if valid, compute the employee’s weekly pay and then print it and the input data. Create methods in
your program where you see fit. Validation: According to the company’s rules, the maximum hours an
employee can work per week is 60 hours, and the maximum hourly rate is $25.00 per hour. If the hours
worked field or the hourly rate field is out of range, the input data and an appropriate message are
to be printed and the employee’s weekly pay is not to be calculated. Weekly pay calculation: Weekly
pay is calculated as hours worked times pay rate. If more than 35 hours are worked, payment for the
overtime hours worked is calculated at time-and-a-half.
 */

import java.util.Scanner;

public class Payroll {
    public static String employeeNumber;
    public static double payRate=0.0, numberOfHours=0.0;

    // get user input about employee
    public static void getEmployeeInfo () {
        Scanner kybrd = new Scanner(System.in);
        System.out.println("Enter Employee Number: ");
        employeeNumber = kybrd.nextLine();
        System.out.println("Enter Employee Pay Rate: ");
        payRate = kybrd.nextDouble();
        System.out.println("Enter Employee worked Hours: ");
        numberOfHours = kybrd.nextDouble();
    }

    public static void printEmployee () {
        System.out.printf(" Employee Name: %s \n  Hour Worked: %.2f\n  Pay Rate: %.2f",
                employeeNumber, numberOfHours  ,payRate);
    }

    public static boolean validate () {
        if ((numberOfHours > 60.0 ) || (payRate > 25.0)) {
            System.out.println("Incorrect enter: Employee worked Hours should < 60 and Pay Rate should < $25.00\n You entered: ");
            return false;
        }

        // validation passed
        return true;

        }
    public static void main (String[] args) {

        double weeklyPay = 0.0;

        getEmployeeInfo ();
        if (validate() == true) {   // if entry pass validation
            //if valid, compute the employee’s weekly pay and then print it and the input data
            weeklyPay = payRate * numberOfHours;
            System.out.printf("Employee Weekly rate is: %.2f", weeklyPay);
            printEmployee ();
        }
        else printEmployee ();
    }
}
