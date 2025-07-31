package ArrayPrograms;

public class ThirdMaxAssignment {

	public static void main(String[] args) {

		int[] a = { 14, 0, 6,4, 9, 10 };

		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				secondMax = max;
				max = a[i];
			} else if (a[i] > secondMax && a[i] != max) {
				thirdMax = secondMax;
				secondMax = a[i];
			}else if (a[i] > thirdMax && a[i] != max && a[i]!=secondMax) {
				thirdMax = a[i];
			}
		}
		//System.out.println("max="+max);
		//System.out.println("secmax="+secondMax);
		System.out.println("thirdmax="+thirdMax);
		//System.out.println(max+secondMax+thirdMax);
	}


	}


