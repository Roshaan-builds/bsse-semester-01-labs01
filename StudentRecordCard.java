import java.util.Scanner;

//Task 1: Student Record Card	[Easy]
// UCP wants a small program that stores a student’s basic record. Read the student ID (a whole number), the full name and the department, then print them as a record card exactly as shown in the test cases.
// Names and departments can contain spaces, so read them with nextLine(). After nextInt(), call nextLine() once to clear the rest of the line.

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

