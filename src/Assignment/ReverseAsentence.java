package Assignment;

public class ReverseAsentence {

	public static void main(String[] args) {
		String s="Welcome To Tp Office";
		String s1[]=s.split(" ");
		String result="";
		for(int i=s1.length-1;i>=0;i--) {
			String data=s1[i];
			result=result+data +" ";
		}
		System.out.println("Result : " + result);

	}

}
