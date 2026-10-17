import java.util.Scanner;
public class FuelAverage{
    public static void main(String[] args){
        Scanner FuelAverage = new Scanner(System.in);
        float distance = FuelAverage.nextFloat();
        float FuelUsed = FuelAverage.nextFloat();
        float price= FuelAverage.nextFloat();
        double FuelAvg = distance / FuelUsed;
        double Cost = (price *FuelUsed)/ distance;
        System.out.printf("Average      : %.2f km/l \n", FuelAvg);
        System.out.printf("Cost per km  : %.2f Rs.\n", Cost);
    }
}