class ConstructorForExample{
	ConstructorForExample(int i){
		System.out.println(i);
	}
	ConstructorForExample(String name){
		System.out.println(name);
	}
	ConstructorForExample(){
		System.out.println();
	}
	ConstructorForExample(int i,String name){
		System.out.println(i+" "+name);
	}
	ConstructorForExample(String name,int i){
		System.out.println(name+" "+i);
	}
	ConstructorForExample(int i,float f){
		System.out.println(i+" "+f);
	}
	public static void main(String args[]){
		ConstructorForExample ce1 = new ConstructorForExample();
		ConstructorForExample ce2 = new ConstructorForExample(3);
	}
}
