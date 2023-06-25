class Animal{
	void eat(){
		System.out.println("eating.....");
	}
}
class Dog extends Animal{
	void eat(){
		System.out.println("eating bread...");
	}
	void bark(){
		System.out.println("barking....");
	}
	void work(){
		super.eat();
	}
}
class SuperExample2{
	public static void main(String args[]){
		Dog d = new Dog();
		d.work();
		d.bark();
		//d.super.eat();
		new Dog().work();
		new Animal().eat();
		d.eat();
	}
}