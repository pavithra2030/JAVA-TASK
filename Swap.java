import java.util.Scanner;
public class Swap{
public static void main(String args[]){
Scanner op = new Scanner(System.in);

System.out.println("Enter the first number:");
int num1 = op.nextInt();

System.out.println("Enter the second number:");
int num2 = op.nextInt();


num1 = num1+num2;
num2 = num1-num2;
num1 = num1-num2;



System.out.println(num1);
System.out.println(num2);

}
}
