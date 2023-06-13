import java.util.Scanner;
class Data{
	public static void main(String arg[]){
	System.out.println("Enter your Integer:");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	System.out.println("Your Integer value is " +a);

	System.out.println("Enter your short value:");
	short b = sc.nextShort();
	System.out.println("Your short value is " +b);

	System.out.println("Enter your Long value:");
	long c = sc.nextLong();
	System.out.println("Your Long value is " +c);

	System.out.println("Enter your float:");
	float d = sc.nextFloat();
	System.out.println("Your Float value is " +d);

	System.out.println("Enter your double:");
	double e = sc.nextDouble();
	System.out.println("Your double value is " +e);
	
	System.out.println("Enter your boolean:");
	boolean f = sc.nextBoolean();
	System.out.println("Your boolean value is " +f);

	System.out.println("Enter your byte:");
	byte g = sc.nextByte();
	System.out.println("Your byte value is " +g);
	
	System.out.println("Enter your character:");
	char h = sc.next().charAt(0);
	System.out.println("Your character value is " +h);

	

	}
}
