//import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		Stack<String> names = new Stack<String>();
		names.add("Sai");
		names.add("Ravi");
		names.add("Naga");
		Iterator<String> iterator = names.iterator();
		while(iterator.hasNext()){
			String str = iterator.next();
			System.out.println(str);
		}
		Stack<String> names2 = new Stack<String>();
		names2.add("Sai");
		names2.add("Naga");
		names2.add("phani");
		
				names.remove("Ravi");
				System.out.println("After removal");
		for (String str : names) {
			System.out.println(str);
		}
		System.out.println("using retainAll");
		System.out.println(names.retainAll(names2));
		System.out.println("Using containsAll");
		System.out.println(names.containsAll(names2));
	}
}