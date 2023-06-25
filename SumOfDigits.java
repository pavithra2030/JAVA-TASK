import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = op.nextInt();

        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
	

        System.out.println("The sum of the digits is " + sum);
    }
}