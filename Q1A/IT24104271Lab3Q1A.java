import java.util.Scanner;
public class IT24104271Lab3Q1A{
public static void main (String[] args){

Scanner pf=new Scanner(System.in);
System.out.print("Enter the price of 1kg of rice: ");
int price=pf.nextInt();
System.out.print("Enter the number of kilograms you want to buy: ");
int number=pf.nextInt();
System.out.println();
double total=number*price;

System.out.print("The total amount is: "+ total);
}
}