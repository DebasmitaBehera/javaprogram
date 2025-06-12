package ArrayPrograms;

import java.util.Arrays;

public class SortWithoutList {

	public static void main(String[] args) {
		int a[]= {9,8,7,6,2};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
			if(a[j+1]>a[j]) {
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		}
		System.out.println(Arrays.toString(a));		
	}	
}
