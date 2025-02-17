package Assignment;

public class generateSubstringGreaterThan1 {

	public static void main(String[] args) {
			String s="add";
			for(int i=0;i<s.length();i++) {
				for(int j=1+1;j<=s.length();j++) {
			if(s.substring(i,j).length()>1) 
			{
				System.out.print(s.substring(i,j) + " ");
				
					}
					
				}

	}

}}

