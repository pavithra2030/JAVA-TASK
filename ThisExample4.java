class ThisExample3{
	String name,clg;
	int rollno;
	float fee;
	ThisExample3(String name,int rollno,float fee){
		this.name = name;
		this.rollno = rollno;
		this.fee = fee;
	}
	ThisExample3(String name,int rollno,float fee,String clg){
		this(name, rollno, fee);
		this.clg = clg;
	}

void display(){
	System.out.println(name+" "+rollno+" "+fee+" "+clg);
	}


}
class ThisExample4{
	public static void main(String args[]){
		ThisExample3 ex = new ThisExample3("pavi",2,2000.987f);
		ThisExample3 ex1 = new ThisExample3("pavi",2,2000.987f,"KITE");
		ex.display();
		ex1.display();
	}
}
		
	
	
