import java.util.Scanner;
class ElseIfEx{
public static void main(String args[]){
	Scanner op = new Scanner(System.in);
	System.out.println("Enter your mark");
	int mark = op.nextInt();
	if((mark>0)&&(mark<35)){
		System.out.println("Grade C");
	}
	else if((mark>35)&&(mark<75)){
		System.out.println("Grade B");
	}
	else if((mark>75)&&(mark<90)){
		System.out.println("Grade A");
	}
	else{
		System.out.println("Grade A+");

	}
}
}
