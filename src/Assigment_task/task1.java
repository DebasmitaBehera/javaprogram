package Assigment_task;

public class task1 {

	public static void main(String[] args) {
		int row=5;
		int i,j,k,l;
		for(i=1;i<=row;i++) {
			for(j=1;j<=(row-i);j++) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print("*");
			}
			for(l=i-1;l>=1;l--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
