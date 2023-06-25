import java.util.*;
class StackExample{
	public static void main(String args[]){
		Stack<String> s = new Stack<String>();
		s.push("kavi");
		s.push("kayal");
		s.push("Amit");
		s.push("Anu");
		s.push("Madhu");
		s.pop();
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
