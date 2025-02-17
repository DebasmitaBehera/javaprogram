package StringPrograms;

public class StringPallindrome {

	public static void main(String[] args) {
		String s="Malayalam";
		String result="";
		for(int i=s.length()-1;i>=0;i--) {
			result=result+s.charAt(i);
		}
		if(s.equalsIgnoreCase(result))
		{
			System.out.println("It is a Pallindrome : "+ result);
			
		}
		else
		
			System.out.println("It is not a Pallindrome : "+ result);
		
			
			

	}

}
