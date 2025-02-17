package Assignment;

import java.util.Arrays;
import java.util.List;

public class PrintDuplicateArray {

	public static void main(String[] args) {
		Integer[] a= {1,2,3,3,4,4,5,5,6,7};
		List<Integer> list=Arrays.asList(a);
		for(int i=0;i<list.size();i++) 
		{
         if(list.indexOf(list.get(i))!=list.lastIndexOf(list.get(i)) && i==list.indexOf(list.get(i))) {
        	 System.out.print(list.get(i)+" ");
         }
		}

	}

}
