package Practise;

public class sumofdigits {
	public static void main(String[] args) {
	int a = 123;
	int sum = 0;
	int temp = a ;
	while(temp>0) {
		sum+=temp % 10;
		temp=temp/10;	
	}
System.out.println("sum of the digits =" + sum);
}}
