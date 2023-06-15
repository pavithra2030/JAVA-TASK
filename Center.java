import java.util.Scanner;

public class Center {

    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = op.nextInt();

        int center = rows  + 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= center - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *  ");
            }
	     
            
            System.out.println();
        }
    }
}
