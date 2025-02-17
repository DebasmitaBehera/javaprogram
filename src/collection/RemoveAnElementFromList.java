package collection;

import java.util.ArrayList;

public class RemoveAnElementFromList {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("jmeter");
		list.add("Selenium");
		list.add("TestNg");
		list.add("Postman");
		System.out.println(list);
		list.remove("Postman");
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.clear();
		System.out.println(list);
		

	}

}
