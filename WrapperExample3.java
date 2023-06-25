class WrapperExample3{
	public static void main(String args[]){
		byte b = 9;
		short s = 10;
		int i = 6;
		long l = 300;
		float f = 30.34F;
		double d = 60.06D;
		char c = 'p';
		boolean b2 = true;

		Byte b1obj = b;
		Short s1obj = s;
		Integer i1obj = i;
		Long l1obj = l;
		Float f1obj = f;
		Double d1obj = d;
		Character c1obj = c;
		Boolean b3obj = b2;

		System.out.println("------printing object values----");
		System.out.println("Byte object:"+b1obj);
		System.out.println("Short object:"+s1obj);
		System.out.println("Integer object:"+i1obj);
		System.out.println("Long object:"+l1obj);
		System.out.println("Float object:"+f1obj);
		System.out.println("Double object:"+d1obj);
		System.out.println("Character object:"+c1obj);
		System.out.println("Boolean object:"+b3obj);
		System.out.println();
		
		byte b1val = b1obj;
		short s1val = s1obj;
		int i1val = i1obj;
		long l1val = l1obj;
		float f1val = f1obj;
		double d1val = d1obj;
		char c1val = c1obj;
		boolean b2val = b3obj;


		System.out.println("----printing primitive values----");
		System.out.println("byte value:"+b1val);
		System.out.println("short value:"+s1val);
		System.out.println("int value:"+i1val);
		System.out.println("long value:"+l1val);
		System.out.println("float value:"+f1val);
		System.out.println("double value:"+d1val);
		System.out.println("char value:"+c1val);
		System.out.println("boolean value:"+b2val);
	}
}
		
		
		
		
		