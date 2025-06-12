package ArrayPrograms;

import java.util.Arrays;

public class ShiftzerosToRightAssignment {

	public static void main(String[] args) {
		int[] a= {2,4,7,0,5,9,0,0,8,0};
		int[] res=new int[a.length];
		int index=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=0) {
				res[index]=a[i];
				index++;
			}
		}
       System.out.println(Arrays.toString(res));
	}
}


