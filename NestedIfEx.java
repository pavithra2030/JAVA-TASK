import java.util.Scanner;
class NestedIfEx{
public static void main(String args[]){
	Scanner op = new Scanner(System.in);
	System.out.println("Enter your country:");
	String country = op.nextLine();
	System.out.println("Enter your age:");
	int age = op.nextInt();
	if((country.equals("india")) || (country.equals("India"))){
		System.out.println("Welcome to India");
	}
	if(age>=18){
		System.out.println("your eligible for voting");
	}else{
		System.out.println("your not eligible for voting");
	}

}
}
	
