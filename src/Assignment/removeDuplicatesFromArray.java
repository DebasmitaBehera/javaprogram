package Assignment;

import java.util.HashSet;


public class removeDuplicatesFromArray {

	public static void main(String[] args) {
		int n[]= {1,1,2,2,3,3,4,4,4,5,5,5,5};
		HashSet set=new HashSet();
		for(int i=0;i<n.length;i++) {
			int a1=n[i];
			set.add(a1);
		}
System.out.println(set);
	}

}
