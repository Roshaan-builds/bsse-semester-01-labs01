import java.util.Scanner;

public class StudentRecordCard {
    public static void main(String[] args){
        Scanner StudentRecordCard = new Scanner(System.in);

        int id= StudentRecordCard.nextInt();
        StudentRecordCard.nextLine();
        String name= StudentRecordCard.nextLine();
        String department= StudentRecordCard.nextLine();

        System.out.println("-----Student Record-----");
        System.out.print("ID        : "+id);
        System.out.println("Name      : "+name);
        System.out.println("Department: "+department);
    }
}

