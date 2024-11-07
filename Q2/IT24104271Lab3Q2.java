import java.util.Scanner;
public class IT24104271Lab3Q2{
public static void main(String[] args){
Scanner pf=new Scanner(System.in);

System.out.print("Enter the monthly salary: ");
int salary=pf.nextInt();

System.out.print("Enter the number of OT hours: ");
int hours=pf.nextInt();

System.out.print("Enter the OT hourly rate: ");
int rate=pf.nextInt();

System.out.println("  ");
double total=(salary+(hours*rate));
System.out.print("The total salary including OT is: "+ total);
}
}