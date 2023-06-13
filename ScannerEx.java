import java.util.Scanner;
class ScannerEx{
	public static void main(String arg[]){
	System.out.println("Enter your name:");
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	System.out.println("Your name is " +name);
	System.out.println("Enter you password:");
	Scanner ps = new Scanner(System.in);
	String password = ps.nextLine();
	System.out.println("your password is "+password);
	}
}