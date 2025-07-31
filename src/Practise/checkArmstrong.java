package Practise;

public class checkArmstrong {

	public static void main(String[] args) {
	     int a=789;
	     double x=0;
	     int temp=a;
	     
	     while(a>0){
	         int d=a%10;
	         x=x+Math.pow(d,3);
	         a=a/10;
	     }if(temp==x){
	         System.out.print("it is Armstrong");
	         
	     }else
	     System.out.print("not");
	    }

	}


