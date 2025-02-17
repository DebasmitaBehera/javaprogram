package ArrayPrograms;

public class ThirdMinAssignment {

	public static void main(String[] args) {
		int[] a = { 14, 0, 6,4, 9, 10 };

		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		int thirdMin = Integer.MAX_VALUE;


		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				thirdMin = secondMin;
				secondMin = min;
				min = a[i];
			} else if (a[i] < secondMin && a[i] != min) {
				thirdMin=secondMin;
				secondMin = a[i];
			}else if (a[i] < thirdMin && a[i] != min && a[i]!=secondMin) {
				thirdMin=a[i];
			}
		}
		System.out.println(min);
		System.out.println(secondMin);
		System.out.println(thirdMin);


	}


	}


