public class ExceptionExample{
	public static void main(String args[]){
		try{
			int data = 100/0;
		}
		catch(ArithmeticException ex){
			System.out.println(ex);
		}
		System.out.println("rest of the code...........");
	}
}