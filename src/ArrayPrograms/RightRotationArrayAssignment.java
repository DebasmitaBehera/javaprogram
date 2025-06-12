package ArrayPrograms;

import java.util.Arrays;

public class RightRotationArrayAssignment {

	public static void main(String[] args) {
		String s="Bengaluru is silicon city";
		String[] str=s.split(" ");
		for(int i=0;i<4;i++) 
		{
		String temp=str[str.length-1];//to copy the first element
		for(int j=str.length-1;j>0;j--)
		{
			str[j]=str[j-1];
		}
		str[0]=temp;
		System.out.println(Arrays.toString(str));
}}}
