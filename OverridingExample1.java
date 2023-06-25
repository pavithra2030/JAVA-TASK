/*intreface 
method myMethod create method
class main class in
method has been overriding*/

interface I1{
	//public static int myMethod(); // wont work
	//int myMethod(); //won't access the privilege

	int myMethod();
}
class OverridingExample1 implements I1{
	public int myMethod(){
		int a = 10;
		System.out.println(a);
		return a;
	}
	public static void main(String args[]){
		
		OverridingExample1 obj = new OverridingExample1();
		obj.myMethod();
	}
}
	
		
