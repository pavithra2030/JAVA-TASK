interface Drawable{
	void draw();
}
class Rectangle implements Drawable{
	public void draw(){
		System.out.println("Drawing rectangle.....");
	}
}
class Circle implements Drawable{
	public void draw(){
		System.out.println("Printable circle.......");
	}
}
class TestInterface{
	public static void main(String args[]){
		Drawable sc = new Rectangle();
		sc.draw();
		Drawable sc1 = new Circle();
		sc1.draw();
	}
}