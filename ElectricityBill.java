import java.util.Scanner;

// Task 2: Gross Pay of an Employee	[Easy]
// A small shop pays its staff by the hour. Read the hours worked and the hourly rate (both may have decimals), then compute the gross pay, a 5% tax on the gross pay, and the net pay.
// Print every amount with exactly two decimal places using System.out.printf("%.2f", value).
    
public class ElectricityBill{
    public static void main(String[] args){
        Scanner ElectricityBill=new Scanner(System.in);
        float P_units=ElectricityBill.nextFloat();
        float N_units=ElectricityBill.nextFloat();
        float Unit_used= N_units - P_units;
        double Bill=(Unit_used*22.50)+150;

        System.out.printf("Units Used : %.2f \n",Unit_used);
        System.out.printf("Bill (Rs.) : %.2f\n",Bill);
    }
}
