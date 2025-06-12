package Practise;

import java.util.Scanner;

public class power {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a base");
        int base=s.nextInt();
        System.out.println("enter a power");
        int power=s.nextInt();
        int res=1;
        for(int i=1;i<=power;i++){
            res*=base;
        }
                    System.out.print(res);

	}

}
