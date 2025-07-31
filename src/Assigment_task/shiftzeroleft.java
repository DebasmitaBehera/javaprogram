package Assigment_task;

import java.util.Arrays;

public class shiftzeroleft {

	public static void main(String[] args) {
		int a[]= {1,3,0,5,7,6,0,0,4,0};
		int temp[]=new int[a.length];
		int index=temp[0];
		for(int i=0;i<temp.length;i++) {
			if(a[i]!=0) {
				temp[index]=a[i];
				index++;
			}
		}
		
System.out.println(Arrays.toString(temp));
	}

}
