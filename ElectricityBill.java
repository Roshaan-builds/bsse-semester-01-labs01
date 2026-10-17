import java.util.Scanner;
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