import java.util.Scanner;
public class CourseFee{
    public static void main(String[] args){
        Scanner CourseFee =new Scanner(System.in);
        int first=CourseFee.nextInt();
        int second=CourseFee.nextInt();
        int third=CourseFee.nextInt();
        int fourth=CourseFee.nextInt();
        int fifth=CourseFee.nextInt();
        final int FEE_PER_CREDIT=9500;
        int TotalCredits=first+second+third+fourth+fifth;
        int TotalFee=FEE_PER_CREDIT*TotalCredits;
        System.out.printf("Total credit hours :%d \n",TotalCredits);
        System.out.printf("Total fee (Rs.)    :%d \n",TotalFee);
    }
}