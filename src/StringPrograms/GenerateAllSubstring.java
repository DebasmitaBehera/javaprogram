package StringPrograms;

public class GenerateAllSubstring {

	public static void main(String[] args) {
		String s="add";
		for(int i=0;i<s.length();i++) {
			for(int j=1+1;j<=s.length();j++) {
				System.out.print(s.substring(i,j)+" ");
			}
		}

	}

}
