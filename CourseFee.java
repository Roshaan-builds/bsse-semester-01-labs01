import java.util.Scanner;

// Task 5: Total Fee of Five Courses	[Easy]
// A student enrols in five courses. Read the credit hours of each course (five whole numbers) and compute the total credit hours and the total fee at Rs. 9,500 per credit hour.
// Keep the fee per credit hour in a final int constant named FEE_PER_CREDIT.
    
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
