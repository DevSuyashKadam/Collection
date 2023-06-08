package demo.cursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList l=new LinkedList<>();
		l.add("balkrishna");
		l.add("venki");
		l.add("chiru");
		l.add("nag");
		
		System.out.println(l);
		
		
		ListIterator itr=l.listIterator();
		while(itr.hasNext()) {
			
			String s=(String)itr.next();
//			if(s.equals("venki")) {
//				itr.remove();
			
			
			
//			if(s.equals("chiru")) {
//				itr.set("charan");
			  
			
			if(s.equals("nag")) {
				itr.add("chitu ");
			
			
			
			}
		}
		
		System.out.println(l);
		
	}

}
