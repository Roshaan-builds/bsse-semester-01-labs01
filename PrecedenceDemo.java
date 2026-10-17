import java.util.Scanner;

// Task 9: Predict the Precedence	[Medium]
// Before running anything, write on paper the value you expect for each expression in the code below. Then type the program exactly as given and run it to check your predictions.
// In a comment next to each line, write which rule explains the result: precedence, left-to-right associativity, integer division, or a type cast.
    
public class PrecedenceDemo{
    public static void main(String[] args){
        int a = 10 + 4 * 3 - 6 / 2;
        //10 + 12 -3 = 19

        int b = (10 + 4) * 3;
        //14 * 3 = 42

        int c = 17 % 5 * 2;
        //2 * 2 = 4

        int d = 100 - 20 - 5;
        //80 - 5 = 75

        System.out.println(a + " " + b + " " + c + " " + d);
        System.out.println(7 / 2 + " " + 7 / 2.0 + " " + (double) 7 / 2 + " " + (int) 7.9);
    }
}
