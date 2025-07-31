package Assigment_task;

public class printthirdmax {

	public static void main(String[] args) {
		int s[]= {1,6,8,7,6,9};
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		int tmax=Integer.MIN_VALUE;
		for(int i=0;i<s.length;i++) {
			if(s[i]>max) {
				smax=max;
				max=s[i];
				
			}else if(s[i]>smax && s[i]!=max) {
				tmax=smax;
				smax=s[i];
			}else if(s[i]>tmax && s[i]!=max && s[i]!=smax) {
				tmax=s[i];
			}
		}
		//System.out.println(max);
		//System.out.println(smax);
		System.out.println(tmax);

	}

}
