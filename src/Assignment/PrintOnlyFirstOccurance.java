package Assignment;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintOnlyFirstOccurance {

	public static void main(String[] args) {
		ArrayList< Integer> arr=new ArrayList< Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(5);
		arr.add(4);
		arr.add(3);
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		LinkedHashSet set=new LinkedHashSet();
		for(int i=0;i<arr.size();i++) {
			int a=arr.get(i);
			set.add(a);
			if(map.containsKey(a)) {
				map.put(a, map.get(a+1));
				
			}
			else
				map.put(a, 1);
		}
System.out.println(set);
	}

}
