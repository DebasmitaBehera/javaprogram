package tekion;

public class prg2 {

	public static void main(String[] args) {
		int a[]= {1,3,4,5,7,9,3};
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		int tmax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				smax=max;
				max=a[i];
				
			}else if(a[i]>smax && a[i]!=max) {
				tmax=smax;
				smax=a[i];
			}else if(a[i]>tmax && a[i]!=max && a[i]!=smax) {
				tmax=a[i];
			}
		}
		
       System.out.println(max);
       System.out.println(smax);
       System.out.println(tmax);


	}

}
