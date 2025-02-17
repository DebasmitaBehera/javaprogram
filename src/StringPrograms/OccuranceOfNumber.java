package StringPrograms;

import java.util.LinkedHashMap;

public class OccuranceOfNumber {

	public static void main(String[] args) {
		String s="nnhhgghshs";
		LinkedHashMap< Character, Integer> hs=new LinkedHashMap();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(hs.containsKey(ch)) {
				hs.put(ch, hs.get(ch)+1);
			}else 
				hs.put(ch, 1);
			
			
		}
		System.out.println(hs);
	}

}
/*
 containskey() : use to check if character is present in map or not
 put() : to add the character in map
 get() : to get the value of key
 Linkedhashmap : to maintain the insertion order
 
 */