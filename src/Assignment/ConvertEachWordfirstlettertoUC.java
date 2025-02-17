package Assignment;

public class ConvertEachWordfirstlettertoUC {

	public static void main(String[] args) {
		String s="welcome to java classes";
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++) {
			String word=s1[i];
			char ch=word.substring(0,1).toUpperCase().charAt(0);
			System.out.print(word.replace(word.charAt(0),ch)+" ");
			

			}
			
		}
		
	}
