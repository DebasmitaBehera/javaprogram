package Assigment_task;

public class stringhavinghighestlength {

	public static void main(String[] args) {
		String str[]= {"nayan","apple","mango","dad","jackfruit"};
		String largest=str[0];
		for(int i=0;i<str.length;i++) {
			if(str[i].length()>largest.length()) {
				largest=str[i];
			}
		}
		System.out.println(largest);
		System.out.println(largest.length());

	}

}
