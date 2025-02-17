package StringPrograms;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		String s="Smita";
		String s1="Deba";
		
		System.out.println("s : "+s);
		System.out.println("s1 : "+s1);
		System.out.println("===========================");
		s=s+s1;
		s1=s.substring(0,s.length()-s1.length());
		s=s.substring(s1.length());
		System.out.println("after swapping");
		System.out.println("s :"+s);
		System.out.println("s1 :"+s1);
		

	}

}
