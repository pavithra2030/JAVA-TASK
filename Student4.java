class Student4{
	int id;
	String name;
	Student4(int i,String n){
		id = i;
		name = n;
	}
	void display(){
		System.out.println(id+" "+name);
	}
	public static void main(String args[]){
		Student4 sc = new Student4(1,"pavi");
		Student4 sc1 = new Student4(8,"pavithra");
		sc.display();
		sc1.display();
	}
}
