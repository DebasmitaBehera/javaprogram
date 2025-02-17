package Assignment;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromAsentence {

	public static void main(String[] args) {
		String s="My Name Is My Name Is Tanu";
		String s1[]=s.split(" ");
		LinkedHashSet set=new LinkedHashSet();
		
		for(int i=0;i<s1.length;i++) {
			String word=s1[i];
			set.add(word);
		}
		for(Object o:set) {
			System.out.println(o);
		}
		//System.out.println(set);

	}

}
