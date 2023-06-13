import java.util.Scanner;
public class TernaryOperator{
public static void main(String args[]){
Scanner to = new Scanner(System.in);
System.out.println("Enter the first value");
int num1 = to.nextInt();
System.out.println("Enter the second value");
int num2 = to.nextInt();
System.out.println((num1<num2)?true:false);
}
}

