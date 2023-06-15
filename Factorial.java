import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = op.nextInt();

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
    }
}
