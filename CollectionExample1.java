import java.util.*;
class CollectionExample1{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		list.add("pavi");
		list.add("kavi");
		list.add(" ");
		list.add("pavi");
		list.add("raj");
		//list.remove("pavi");
		//list.remove(3);
		//Collection.removeAll(list);
		//list.clear();
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}		
	}
}