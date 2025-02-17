package ArrayPrograms;

import java.util.Arrays;

public class SumOfTwoArray {

	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5,6,7};
		int[] b= {4,5,7,8,};
		int maxLength=Math.max(a.length, b.length);
		int[] sum=new int[maxLength];
		for(int i=0;i<sum.length;i++) 
		{
			if(i<a.length) {
				sum[i]+=a[i];
				
			}if(i<b.length) {
				sum[i]+=b[i];
			}
		}
		System.out.println(Arrays.toString(sum));

	}

}
