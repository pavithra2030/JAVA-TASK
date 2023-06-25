class ThisExample1{
	int rollno;
	String name;
	float fee;
	ThisExample1(int rollno,String name,float fee){
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}
	void display(){
		System.out.println(rollno+" "+name+" "+fee);
	}
	public static void main(String args[]){
		ThisExample1 obj = new ThisExample1(1,"pavi",30000);
		obj.display();
	}
}