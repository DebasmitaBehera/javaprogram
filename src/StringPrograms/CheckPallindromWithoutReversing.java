package StringPrograms;

public class CheckPallindromWithoutReversing {

	public static void main(String[] args) {
		String s="mom";
		boolean flag=true;
		for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				flag=false;
				break;
			}
		}
if(flag)
{
	System.out.println("pallindrom");
}else 
{
	System.out.println("not pallindrom");
	
}
}
}