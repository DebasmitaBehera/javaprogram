package tekion;

import java.util.HashMap;
import java.util.Map.Entry;

public class prg8 {

	public static void main(String[] args) {
		String s="debasmita";
		HashMap< Character, Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
				map.put(c, 1);
			
		}
		for(Entry< Character, Integer> e:map.entrySet()) {
			System.out.print(e.getValue()+" "+e.getKey());
		}

	}

}
