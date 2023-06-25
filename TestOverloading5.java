class TestOverloading5{
	public static void main(String args[]){
		System.out.println("main with string[]");
		new TestOverloading5().main("pavi");
		main();
		}
		public void main(String arg){
			System.out.println("main with string");
		}
		public static void main(){
			System.out.println("main without args");
		}
}
