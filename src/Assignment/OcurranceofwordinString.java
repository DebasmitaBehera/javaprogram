package Assignment;

import java.util.LinkedHashMap;

public class OcurranceofwordinString {

	public static void main(String[] args) {
		String s="My Name Is My Name Is Tanu";
		String s1[]=s.split(" ");
		LinkedHashMap< String, Integer> hs=new LinkedHashMap();
		for(int i=0;i<s1.length;i++)
		{
			String word=s1[i];
			if(hs.containsKey(word)) {
				hs.put(word, hs.get(word)+1);
				
			}
			else
				hs.put(word, 1);
		}	
	
	System.out.print(hs);
}
}