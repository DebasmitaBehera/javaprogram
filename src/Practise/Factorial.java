package Practise;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	        Scanner s=new Scanner(System.in);
	        System.out.println("enter a no");
	        int a=s.nextInt();
	        int factorial=1;
	        for(int i=1;i<=a;i++){
	            factorial*=i;    
	        }
	        System.out.println(factorial);
	}

}
