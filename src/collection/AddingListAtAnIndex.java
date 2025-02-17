package collection;

import java.sql.Array;
import java.util.ArrayList;

public class AddingListAtAnIndex {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("MasterChef");
		list.add("SareGaMaPa");
		list.add("DKD");
		list.add("KBC");
		ArrayList list1=new ArrayList();
		list1.add("SanjeebKapoor");
		list1.add("Anshushree");
		list1.add("Anand");
		list1.add("Appu");
		list.addAll(4,list1);
		System.out.println(list);
		

	}

}
