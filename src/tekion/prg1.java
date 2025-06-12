package tekion;

public class prg1 {

	public static void main(String[] args) {
		String s="ABCDEFDAA";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(s.indexOf(ch)!=s.lastIndexOf(ch) && i==s.indexOf(ch));
			System.out.print(ch);
		}

	}

}
