package collection;

import java.sql.Array;
import java.util.ArrayList;

public class LearningContainsInList {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Thailand");
		list.add("USA");
		list.add("Nepal");
		list.add("Australia");
		System.out.println(list.contains("Thailand"));
		ArrayList list1=new ArrayList();
		list1.add("USA");
		list.add("Nepal");
		list.add("Australia");
		System.out.println(list.containsAll(list1));
		System.out.println(list1.indexOf("Nepal"));

	}

}
