public class Student5{
	int rollno;
	String name;
	static String college = "KITE";
	Student5(int id,String n){
		rollno = id;
		name = n;
	}
	void display(){
		System.out.println(rollno+" "+name+" "+college);
	}
	public static void main(String args[]){
		Student5 sc1 = new Student5(101,"pavi");
		sc1.display();
	}
}
	