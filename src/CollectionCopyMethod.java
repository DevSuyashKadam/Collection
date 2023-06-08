import java.util.ArrayList;
import java.util.Collections;

public class CollectionCopyMethod {

	
	
	
	public static void main(String[] args) {
		
		ArrayList<String> mylist = new ArrayList<>();
		
		mylist.add("bbb");
		mylist.add("aaa");
		mylist.add("eee");
		mylist.add("ccc");
		
		ArrayList<String> destination = new ArrayList<>();
		destination.add("a");
		destination.add("a");
		destination.add("a");
		destination.add("a");
		destination.add("a");
		destination.add("b");
		
		
		Collections.copy(destination , mylist);
		
		System.out.println("copied List : " + destination);
	}
	
	
	
	
}
