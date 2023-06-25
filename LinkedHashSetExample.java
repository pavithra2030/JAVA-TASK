import java.util.*;
class LinkedHashSetExample{
	public static void main(String args[]){
		LinkedHashSet<String> v = new LinkedHashSet<String>();
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