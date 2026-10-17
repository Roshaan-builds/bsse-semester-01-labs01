import java.util.Scanner;

// Task 10: Cash Counter	[Medium]
// A cashier wants to pay an amount using the fewest notes. Read a whole amount in rupees and print how many notes of Rs. 5000, 1000, 500, 100, 50 and 10 are needed, followed by the rupees left over.
// Use / to count the notes of one kind and % to keep the amount that is still unpaid.
    
public class Cashier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        int n5000 = amount / 5000;  amount %= 5000;
        int n1000 = amount / 1000;  amount %= 1000;
        int n500  = amount / 500;   amount %= 500;
        int n100  = amount / 100;   amount %= 100;
        int n50   = amount / 50;    amount %= 50;
        int n10   = amount / 10;    amount %= 10;

        System.out.println("5000: " + n5000);
        System.out.println("1000: " + n1000);
        System.out.println("500 : " + n500);
        System.out.println("100 : " + n100);
        System.out.println("50  : " + n50);
        System.out.println("10  : " + n10);
        System.out.println("Left: " + amount);


    }
}
