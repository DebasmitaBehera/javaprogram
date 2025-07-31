package Practise;

public class highestlengthpallindrom {

	public static void main(String[] args) {
		String str[]={"banana","malayalam","dad","mango","nayan","employee","racuar","level"};
		String output="";
		for(int i=0;i<str.length;i++) {
			 String word=str[i];
			String rev = new StringBuilder(word).reverse().toString();
		
		if(word.equals(rev)) {
			if(rev.length()>output.length()) {
		output=rev;
			
		}
		}}
		System.out.println(output);
	}}


