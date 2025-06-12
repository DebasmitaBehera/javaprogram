
package StringPrograms;

public class ReverseUsingRecursion {

	public static void main(String[] args) {
		String s="Gear Up";
		reverse(s);
	

	}
	public static void reverse(String s) {
		if(s.length()>0) {
			System.out.print(s.charAt(s.length()-1));
			reverse(s.substring(0,s.length()-1));
			
		}
	}

}
