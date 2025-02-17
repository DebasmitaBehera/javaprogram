package PatternProgram;

public class Traingle_2 {

	public static void main(String[] args) {

		int r = 3;
		int i;
		int j;
		for ( i = 1; i <= r; i++) {
			for (j = 1; j <= r; j++) {
				if (i <= j) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();

		}

	}

}

