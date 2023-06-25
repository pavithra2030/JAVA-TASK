class Animal{
	String color = "blue";
}
class Dog extends Animal{
	String color = "red";
	void printColor(){
		System.out.println(color);
		System.out.println(super.color);
	}
}
class SuperExample1{
	public static void main(String args[]){
	Dog d = new Dog();
	d.printColor();
	}
}