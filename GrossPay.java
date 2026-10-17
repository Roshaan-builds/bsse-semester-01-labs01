import java.util.Scanner;

// Task 2: Gross Pay of an Employee	[Easy]
// A small shop pays its staff by the hour. Read the hours worked and the hourly rate (both may have decimals), then compute the gross pay, a 5% tax on the gross pay, and the net pay.
// Print every amount with exactly two decimal places using System.out.printf("%.2f", value).

public class GrossPay{
    public static void main(String[] args){
        Scanner Pay = new Scanner(System.in);

        int hours=Pay.nextInt();
        double gross=Pay.nextDouble();
        Pay.nextLine();
        double Salary =hours*gross;
        double Tax=(5.0/100)*Salary;
        double Net=Salary-Tax;
        System.out.printf("Gross Pay : %.2f\n",Salary);
        System.out.printf("Tax (5%%)  : %.2f\n",Tax);
        System.out.printf("Net Pay   : %.2f\n",Net);
    }
}

