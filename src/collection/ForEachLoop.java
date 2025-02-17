package collection;

import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Tanuja");
		list.add("Vijayalaxmi");
		list.add("Vaishali");
		list.add("Neha");
		for(Object o:list) {
			System.out.println(o);
		}

	}

}
