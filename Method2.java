class Method1{
	int rollno;
	String name;
	static String college = "KITE";
	static void change(){
		college = "KGISL";
	}
	Method1(int id,String n){
		rollno = id;
		name = n;
	}
	void display(){
		System.out.println(rollno+" "+name+" "+college);
	}
}
public class Method2{
	public static void main(String args[]){
		Method1.change();
		Method1 sc1 = new Method1(101,"pavi");
		sc1.display();
	}
}
	