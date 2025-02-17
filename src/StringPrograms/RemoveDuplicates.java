package StringPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s="aabbgghhhhjsjsjsj";
		LinkedHashSet hash=new LinkedHashSet();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			hash.add(ch);
			
			
		}
		//System.out.print(hash);
		for(Object obj:hash) {
			System.out.print(obj);
		}

	}

}
/*
linkedhashset : to maintain insertion order
set : to remove duplicates
for loop : to iterate
add() : to add the character to set
*/