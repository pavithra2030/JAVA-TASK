class FinallyExample{
	public static void main(String args[]){
		try{
			int data = 100/5;
			System.out.println(data);
		}
	/*catch(Exception ex){
		ex.printStackTrace();
	}*/
	finally{
		System.out.println("finally block is always executed");
	}
	System.out.println("rest of the code............");
	}
}
	
		