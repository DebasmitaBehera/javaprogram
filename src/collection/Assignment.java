package collection;

import java.util.ArrayList;

public class Assignment {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("puliogre");
		list.add("pulo");
		list.add("Tomato Rice");
		list.add("Dal Rice");
		int v=10;
		
		
		for(int i=0;i<list.size();i++)
		{
			String ele=(String)list.get(i);
			System.out.println(ele+v);
			v=v+10;
		}
		

	}

}
