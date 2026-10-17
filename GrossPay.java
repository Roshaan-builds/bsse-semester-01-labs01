import java.util.Scanner;
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

