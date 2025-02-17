package ArrayPrograms;

public class FindSecondMax {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int max=Integer.MIN_VALUE;
		int sec_max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i] > max) {
				sec_max=max;
				max = a[i];
				
				
			}else if(a[i] > sec_max && a[i] !=max) {
				sec_max=a[i];
			}
		}
				
System.out.println(sec_max);
	}

}
