import java.util.Scanner;

// Task 6: Total Marks and Percentage	[Easy]
// Read the marks of a student in five courses (each out of 100, whole numbers). Print the total marks out of 500 and the percentage with two decimal places.
// Be careful: total / 500 * 100 uses integer division and gives a wrong answer. Write the expression so that the division is done with a double.
    
public class MarksTotal{
    public static void main(String[] args){
        Scanner MarksTotal = new Scanner(System.in);
        float first=MarksTotal.nextFloat();
        float second=MarksTotal.nextFloat();
        float third=MarksTotal.nextFloat();
        float fourth=MarksTotal.nextFloat();
        float fifth=MarksTotal.nextFloat();
        float total=first+second+third+fourth+fifth;
        double per= (total / 500.0) * 100;
        System.out.printf("Total :%.2f / 500\n",total);
        System.out.printf("Percentage : %.2f%%\n",per);
    }
}
