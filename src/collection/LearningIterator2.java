package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class LearningIterator2 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		ListIterator l1=list.listIterator();
		while(l1.hasNext()) {
			System.out.println(l1.next());
		}
		System.out.println("===================");
	    while (l1.hasPrevious()) {
	    	System.out.println(l1.previous());
			
			
		}
	    System.out.println("================");
	    ListIterator l2=list.listIterator(5); 
	    	System.out.println(l2.next());
	    	
		
	}

}
