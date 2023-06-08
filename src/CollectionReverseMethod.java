import java.util.ArrayList;
import java.util.Collections;

public class CollectionReverseMethod {

	public static void main(String[] args) {
		
		ArrayList mylist=new ArrayList<>();
		
		mylist.add("bbb");
		mylist.add("aaa");
		mylist.add("eee");
		mylist.add("ccc");
		mylist.add("fff");
		mylist.add("ggg");
		mylist.add("ddd");
		System.out.println("Original   :"+mylist);
		
		Collections.reverse(mylist);
		
		System.out.println(mylist);
	}
	
	
	
}
