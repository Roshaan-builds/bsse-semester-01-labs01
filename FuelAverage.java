import java.util.Scanner;

// A driver wants to know how economical the car is. Read the distance travelled (km), the fuel used (litres) and the price of one litre, then print the fuel average in km per litre and the fuel cost of one kilometre.
// Print both results with two decimal places.
    
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
