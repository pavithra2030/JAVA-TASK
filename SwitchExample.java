import java.util.Scanner;
class SwitchExample{
public static void main(String args[]){
Scanner se = new Scanner(System.in);
System.out.println("Enter the shop name:");
String name = se.nextLine();
System.out.println("Enter the rating:");
int rate = se.nextInt();
switch(rate){

case 1:System.out.println("will improve");
break;
case 2:System.out.println("try our level best");
break;
case 3:System.out.println("good");
break;
case 4:System.out.println("very good");
break;
case 5:System.out.println("Thank you for voting ");
break;
default:System.out.println("Thankyou for your support");
}
}
}


