package ArrayPrograms;

import java.util.Arrays;

public class LeftRotation {

	public static void main(String[] args) {
		String s="Bengaluru is silicon city";
		String[] str=s.split(" ");
		for(int i=0;i<4;i++) {
		String temp=str[0];//to copy the first element
		for(int j=1;j<str.length;j++) {
			str[j-1]=str[j];
			}
		str[str.length-1]=temp;
		System.out.println(Arrays.toString(str));
}
}
	
}