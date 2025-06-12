package Assignment;

public class swapfirstlettertolast {

	public static void main(String[] args) {
		String s="Welcome To admin World";
		String s1[]=s.split(" ");
		String result="";
		String temp=s1[0];
		s1[0]=s1[s1.length-1];
		s1[s1.length-1]=temp;
		for(int i=0;i<s1.length;i++)
		{
		String word=s1[i];
		result+=word+" ";
		}
		System.out.println(result);
	}
}
