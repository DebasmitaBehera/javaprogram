package tekion;

public class prg1 {

	public static void main(String[] args) {
		String string="ABCDEFDAA";
		for(int i=0;i<string.length();i++) {
			char ch=string.charAt(i);
			if(string.indexOf(ch)!=string.lastIndexOf(ch) && i==string.indexOf(ch));
			System.out.print(ch);
		}

	}

}
