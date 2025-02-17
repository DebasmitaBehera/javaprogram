package Assignment;

import java.util.ArrayList;

public class PrintUniqueArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(3);
		for(int i=0;i<list.size();i++) {
			if(list.indexOf(list.get(i))==list.lastIndexOf(list.get(i)))
			{
				System.out.println(list.get(i)+" ");
				
			}
		}


	}

}
