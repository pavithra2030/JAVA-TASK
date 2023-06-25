class OverloadingExample7{
	void sum(int a,long b){
		System.out.println("a method invoked");
	}
	void sum(long a,int b){
		System.out.println("b method invoked");
	}
	public static void main(String args[]){
		OverloadingExample7 obj = new OverloadingExample7();
		obj.sum(34,2000000000l);
		obj.sum(2000000000l,67);
	}
}
		