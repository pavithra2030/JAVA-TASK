class ThisExample2{
	void m1(){System.out.println("say haiii....");}
	void m2(){
           m1();{
		System.out.println("say hello....");
		}
	}
	public static void main(String args[]){
		ThisExample2 obj = new ThisExample2();
		obj.m2();
	}
}
