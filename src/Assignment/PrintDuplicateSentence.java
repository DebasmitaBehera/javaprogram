package Assignment;

public class PrintDuplicateSentence {

	public static void main(String[] args) {
		String s="i love java i love java nchjhc jshbdc";
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++) {
			String word=str[i];
//			System.out.println(word);
			if(s.indexOf(word)!=s.lastIndexOf(word) && i==s.indexOf(word) ) {
				System.out.print(word +" ");
			}
			
		}

	}

}
