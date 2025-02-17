package StringPrograms;

public class ReverseStringWithoutReversingSpace {

	public static void main(String[] args) {
		String s="my name is debasmita";
		String withoutSpace = s.replace(" ", "");
		int last=withoutSpace.length()-1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				System.out.print(" ");
			}else
			{
				System.out.print(withoutSpace.charAt(last--));
			}
			
		}

	}

}
