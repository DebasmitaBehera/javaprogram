package ArrayPrograms;

public class SecondMinAssignment {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int min=Integer.MAX_VALUE;
		int sec_min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i] < min) {
				sec_min=min;
				min = a[i];
				
				
			}else if(a[i] < sec_min && a[i] !=min) {
				sec_min=a[i];
			}
		}
				
System.out.println(sec_min);
	}


	}


