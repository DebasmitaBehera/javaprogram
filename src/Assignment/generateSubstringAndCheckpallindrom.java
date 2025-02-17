package Assignment;

public class generateSubstringAndCheckpallindrom {

	public static void main(String[] args) {
		String s="add";
		for(int i=0;i<s.length();i++) 
		{
			for(int j=i+1;j<=s.length();j++)
			{
				String str=s.substring(i, j);
				
				String res="";
				for(int t=str.length()-1;t>=0;t--)
				
					res=res+str.charAt(t);
				
				if(str.equalsIgnoreCase(res))
			
					System.out.print(str + " ");
			}
}}}