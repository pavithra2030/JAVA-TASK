import java.util.Scanner;
public class Arithmetic{
public static void main(String args[]){
Scanner op = new Scanner(System.in);
System.out.println("Enter the first number:");
int num1 = op.nextInt();
//System.out.println(num1);
System.out.println("Enter the second number:");
int num2 = op.nextInt();
//System.out.println(num2);
System.out.println("addition "+(num1+num2));
System.out.println("subtraction "+(num1-num2));
System.out.println("multiply "+(num1*num2));
System.out.println("division "+(num1/num2));
System.out.println("modulus "+(num1%num2));
}
}