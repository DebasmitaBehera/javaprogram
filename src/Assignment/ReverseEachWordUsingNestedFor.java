package Assignment;

public class ReverseEachWordUsingNestedFor {

	public static void main(String[] args) {
		String s="Welcome to the programming world";
		String[] s1 = s.split(" ");
		for(int i=0;i<s1.length;i++) {
			String str=s1[i];
			for(int j=str.length()-1;j>=0;j--) {
			char ch=str.charAt(j);	
			System.out.print(str.charAt(j));
	}
		System.out.print(" ");
}
}}