package StringPrograms;

public class CharacterToUpperCase {

	public static void main(String[] args) {
		String s="my name is debasmita";
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			String ch=arr[i];
			System.out.print(Character.toUpperCase(ch.charAt(0))+ch.substring(1)+" ");
		}

	}

}
