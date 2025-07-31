package Assigment_task;

public class diffentiatealphabets_numbers_spclchar {

	public static void main(String[] args) {
		String s="debasmita1234567@#$%^&";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!(ch>='0' && ch<='9' || ch>='a' && ch<'z' || ch>='A' && ch<'Z')) {
				System.out.println("special characters"+" : "+ch);
			}
			else if(ch>='0' && ch<='9')
			{
				System.out.println("numbers"+" : "+ch);
				
			}
			else
				System.out.println("alphabets"+" : "+ch);
			
				
		}
		
		
	}

}
