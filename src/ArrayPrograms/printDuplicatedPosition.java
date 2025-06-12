package ArrayPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class printDuplicatedPosition {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,4,3,2,1,};
//		String s="my name is smita";
//		String[] s1=s.split(" ");
		LinkedHashMap<Integer, ArrayList<Integer>> map=new LinkedHashMap<>() ;
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.get(a[i]).add(i);
				
			}else {
				map.put(a[i], new ArrayList<Integer>());
			}
			
		}
		for(Entry<Integer, ArrayList<Integer>> ref:map.entrySet()) {
			if(ref.getValue().size()==1) {
				System.out.println(ref.getKey()+" "+ref.getValue()+" ");
			}
			
		}
		

	}

}
