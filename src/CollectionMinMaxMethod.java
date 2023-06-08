import java.util.ArrayList;
import java.util.Collections;

public class CollectionMinMaxMethod {

	
	public static void main(String[] args) {
		
		ArrayList<String> mylist = new ArrayList<>();
		
		mylist.add("bbb");
		mylist.add("aaa");
		mylist.add("eee");
		mylist.add("ccc");
		System.out.println("Original List : " + mylist);
		
		System.out.println("min      :"+Collections.min(mylist));

		System.out.println("max      :"+Collections.max(mylist));
		
	}

	
	
}
