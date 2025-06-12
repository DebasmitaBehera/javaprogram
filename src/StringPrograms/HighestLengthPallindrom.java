package StringPrograms;

public class HighestLengthPallindrom {
			public static void main(String[] args) {
				String s="add";
				for(int i=0;i<s.length();i++) {
					for(int j=1+1;j<=s.length();j++)
					{
						String s1 = s.substring(i,j)+" ";
						String rev="";
						for(int k =s1.length()-1;k>=0;k--) {
							rev=rev+s1.charAt(k);
							if(rev.equalsIgnoreCase(s1)) {
								System.out.println(s1);
							}
							
							
}
}}
}}

