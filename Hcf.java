import java.util.Scanner;
public class Hcf{
public static void main(String args[]){
Scanner op = new Scanner(System.in);

System.out.println("Enter the first number:");
int num1 = op.nextInt();

System.out.println("Enter the second number:");
int num2 = op.nextInt();

int temp;
while (num2 > 0)
   	{
   	     temp = num2;
   	     num2 = num1 % num2; 
   	     num1 = temp;
   	}
	System.out.println("hcf="+num1);
	}	
}