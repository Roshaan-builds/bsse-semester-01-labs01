import java.util.Scanner;
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