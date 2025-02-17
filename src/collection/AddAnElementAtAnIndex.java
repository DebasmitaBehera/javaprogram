package collection;

import java.util.ArrayList;

public class AddAnElementAtAnIndex {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("ERP");
		list.add("Banking");
		System.out.println(list);
		list.add(0,"HMS");
		System.out.println(list);

	}

}
