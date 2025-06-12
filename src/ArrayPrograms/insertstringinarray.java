package ArrayPrograms;

import java.util.ArrayList;

public class insertstringinarray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,4};
		ArrayList<Object> list=new ArrayList<>();

		for( int arr:a) {
			if(arr%2==0) {
				list.add(arr);
				
			}
		}
		list.add("smita");
		list.add(10);
		System.out.println(list);

	}

}
