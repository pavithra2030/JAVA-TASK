import java.util.*;
class VectorExample{
	public static void main(String args[]){
		Vector<String> v = new Vector<String>();
		v.add("Ajith");
		v.add("Balu");
		v.add("Ajith");
		v.add(" ");
		v.add("Dharani");
		v.add("Mano");
		Iterator<String> itr = v.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}