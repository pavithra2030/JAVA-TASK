class DestructorGcExample{
	public static void main(String args[]){
		System.out.println("System.gc(Garbage collection)");
		DestructorGcExample obj = new DestructorGcExample();
		obj = null;
		System.gc();
		System.out.println("Gc has been calling");
	}
}