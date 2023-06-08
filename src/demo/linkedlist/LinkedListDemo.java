package demo.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		LinkedList l=new LinkedList();
		l.add("Suyash");
		l.add(30);
		l.add(null);
		l.add("suyash");
		
		System.out.println(l);
		l.set(0, "Software");
		System.out.println(l);
		
		l.set(0, "Develpoment");
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.addFirst("vvv");
		System.out.println(l);
		
		
	}

}
