import java.util.ArrayList;
public class ArrayLists {
		public static void main(String args[]){
			ArrayList<String> names = new ArrayList<String>();
			names.add("Sai");
			names.add("Ravi");
			names.add("Naga");
			for (String str : names) {
				System.out.println(str);
			}
		}
}
