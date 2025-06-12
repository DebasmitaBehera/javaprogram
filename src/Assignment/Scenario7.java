package Assignment;

import java.util.LinkedHashMap;

public class Scenario7 {

	public static void main(String[] args) {
		int n[]= {1,1,2,2,3,3,4,4,4,5,5,5,5};
		LinkedHashMap<Integer, Integer> map=new LinkedHashMap();
		for(int i=0;i<n.length;i++) {
			int a1=n[i];
			if(map.containsKey(a1)) {
				map.put(a1, map.get(a1+1));
				
			}
			else
				map.put(a1, 1);
		}
	}

}
