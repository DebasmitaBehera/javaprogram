package collection;

import java.util.ArrayList;

public class LearningGetMethod {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("puligre");
		list.add("pulav");
		list.add("Tomato Rice");
		list.add("Dal Rice");
		//System.out.println(list.get(0));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		

	}

}
