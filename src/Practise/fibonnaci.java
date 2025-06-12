package Practise;

import java.util.Scanner;

public class fibonnaci {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("emter a no");
        int a=s.nextInt();
        int first=0;
        int second=1;
        for(int i=0;i<=a;i++){
            System.out.print(first);
            int next=first+second;
            first=second;
            second=next;
            
        }
	}

}
