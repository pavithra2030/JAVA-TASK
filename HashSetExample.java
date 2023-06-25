import java.util.*;
class HashSetExample{
	public static void main(String args[]){
		HashSet<String> v = new HashSet<String>();
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
