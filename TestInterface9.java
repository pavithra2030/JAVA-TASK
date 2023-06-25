interface Printable{
	void print();
}
interface Showable extends Printable{
	void show();
}
class TestInterface9 implements Showable{
	public void print(){System.out.println("Hello World...");}
	public void show(){System.out.println("Welcome...");}

public static void main(String args[]){
	TestInterface9 obj = new TestInterface9();
	obj.print();
	obj.show();
}
}
	