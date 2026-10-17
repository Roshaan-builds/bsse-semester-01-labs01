import java.util.Scanner;

// Task 8: Digits of a Four-Digit Number	[Medium]
// Read a four-digit whole number. Separate its digits with % 10 and / 10, then print the sum of the four digits and the number written in reverse order.
// Build the reverse with arithmetic only (no strings). A number such as 1200 reverses to 21 because leading zeros disappear.
    
public class DigitMagic{
    public static void main(String[] args){
        Scanner digit=new Scanner(System.in);
        int num=0,unit=0,ten=0,hund=0,thous=0;
        num=digit.nextInt();
        unit=num%10;
        num=num/10;
        ten=num%10;
        num=num/10;
        hund=num%10;
        num=num/10;
        thous=num%10;
        num=num/10;
        System.out.printf("Sum of Digits: %d\n",unit+ten+hund+thous);
        System.out.printf("Reversed     : %d%d%d%d",unit,ten,hund,thous);
    }
}
