package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class LearningIterator {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
		System.out.print(itr.next());
		

	}
	}
}
