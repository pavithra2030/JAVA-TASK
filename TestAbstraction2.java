abstract class Bike{
	Bike(){
		System.out.println("Bike is created");
	}
	abstract void run();
	void chnageGear(){
		System.out.println("gear changed");
	}
}
	class Honda9 extends Bike{
	void run(){
		System.out.println("running saftely");
	}
	}
	class TestAbstraction2{
		public static void main(String args[]){
			Bike obj = new Honda9();
			obj.run();
			obj.chnageGear();
		}
	}	