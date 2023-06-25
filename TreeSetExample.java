import java.util.*;
class TreeSetExample{
	public static void main(String args[]){
		TreeSet<String> v = new TreeSet<String>();
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