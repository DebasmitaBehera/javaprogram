package StringPrograms;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s="Welcome to the programming world";
		String[] s1 = s.split(" ");
		for(int i=0;i<s1.length;i++) {
			String str=s1[i];
			StringBuilder Builder=new StringBuilder(str);
			System.out.print(Builder.reverse()+" ");
		}
	}
}
