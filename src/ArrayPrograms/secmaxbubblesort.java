package ArrayPrograms;

import java.util.ArrayList;

public class secmaxbubblesort {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,5,4,7,9,8};
		ArrayList< Integer> list =new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			list.add(a[i]);
			
		}
		System.out.println(list.size()-2);

	}

}
