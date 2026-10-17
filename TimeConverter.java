import java.util.Scanner;
public class TimeConverter{
    public static void main(String[] args){
        Scanner time=new Scanner(System.in);
        int Sec= time.nextInt();
        System.out.printf("%d hours(s) ,%d minute(s), %d second(s)",Sec/3600,(Sec%3600)/60,Sec%60);
    }
}