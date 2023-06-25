class WithoutConstructor{
	int id;
	String name;
	WithoutConstructor(int i,String n){
		id = 1;
		name = n;
	}
	WithoutConstructor(){}
	void display(){
		System.out.println(id+" "+name);
	}
	public static void main(String args[]){
		WithoutConstructor s1 = new WithoutConstructor(111,"paviii");
		WithoutConstructor s2 = new WithoutConstructor();
		s2.id = s1.id;
		s2.name = s1.name;
		s1.display();
		s2.display();
	}
}
	