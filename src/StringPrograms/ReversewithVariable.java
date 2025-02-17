package StringPrograms;

public class ReversewithVariable {

	public static void main(String[] args) {
		String s="Smita";
		
		String rev="";//empty variable
		
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		System.out.print("The Output Is : "+rev );

	}

}


/*
""
""+a=a
a+t=at
at+i=ati
ati+m=atim
atim+S=atimS
*/