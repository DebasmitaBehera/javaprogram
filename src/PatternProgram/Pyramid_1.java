package PatternProgram;

public class Pyramid_1 {

	public static void main(String[] args) {
		int row=8;
		int i,j,k;
		for(i=1;i<=row;i++) {
			for(j=1;j<=row-i;j++) 
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}}}

	


