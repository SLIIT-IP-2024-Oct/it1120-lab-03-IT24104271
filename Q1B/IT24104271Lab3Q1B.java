import java.util.Scanner;
public class IT24104271Lab3Q1B{
public static void main(String[] args){
Scanner pf=new Scanner(System.in);

System.out.print("Enter the price of 1kg of rice: ");

int price=pf.nextInt();


System.out.print("Enter the number of kilograms you want to buy: ");

int number=pf.nextInt();

double total=(price*number)-((price*number)/100.0)*10.0;
System.out.println("  ");
System.out.print("The total amount with 10% discount is: "+ total);
}
}