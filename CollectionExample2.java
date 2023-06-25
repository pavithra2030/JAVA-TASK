import java.util.*;
class CollectionExample2{
	public static void main(String args[]){
		LinkedList<String> list = new LinkedList<String>();
		list.add("bharani");
		list.add("guna");
		list.add(" ");
		list.add("kani");
		list.add("guna");
		//list.remove(4);
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}