package tekion;

public class prg3 {

	public static void main(String[] args) {
		String s="ABG123DFB";
		for(int i=0;i<s.length();i++) {
			     char ch=s.charAt(i);
			     if(!(ch>='0' && ch<='9')){
			        System.out.print(ch);	
		}
	}
}}
