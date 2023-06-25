public class ThrowExample{
	public static void validate(int age){
		if(age<18){
			throw new ArithmeticException("Thambi ne inum valaranum........");
		}
		else{
			System.out.println("vaa mapla...");
		}
	}
	public static void main(String args[]){
		validate(16);
		System.out.println("rest of the code....");
	}
}
		