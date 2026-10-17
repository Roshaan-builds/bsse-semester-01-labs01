import java.util.Scanner;

// Task 7: Seconds to Hours, Minutes and Seconds	[Medium]
// A stopwatch app stores time as a total number of seconds. Read that number and convert it into hours, minutes and remaining seconds.
// Use only the integer operators / and % (1 hour = 3600 seconds, 1 minute = 60 seconds). No if statements are needed.
    
public class TimeConverter{
    public static void main(String[] args){
        Scanner time=new Scanner(System.in);
        int Sec= time.nextInt();
        System.out.printf("%d hours(s) ,%d minute(s), %d second(s)",Sec/3600,(Sec%3600)/60,Sec%60);
    }
}
