class Bank{
	float getRateOfInterest(){
		return 0;
	}
}
class SBI extends Bank{
	float getRateOfInterest(){
		return 8.4f;
	}
}
class INDIAN extends Bank{
	float getRateOfInterest(){
		return 4.8f;
	}
}
class ICICI extends Bank{
	float detRateOfInterest(){
		return 9.7f;
	}
}
public class PolymorphismExample{
	public static void main(String args[]){
		Bank b;
		b = new SBI();
		System.out.println("SBI rate of interest "+b.getRateOfInterest());
		b = new INDIAN();
		System.out.println("INDIAN rate of interest "+b.getRateOfInterest());
		b = new ICICI();
		System.out.println("ICICI rate of interest "+b.getRateOfInterest());
	}
}
		
