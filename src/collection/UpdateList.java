package collection;

import java.util.ArrayList;

public class UpdateList {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Eat");
		list.add("Sleep");
		list.add("Repaet");
		System.out.println(list);
		list.set(0, "i ate");
		System.out.println(list);

	}

}
