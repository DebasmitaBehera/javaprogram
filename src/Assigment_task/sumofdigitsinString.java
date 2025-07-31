package Assigment_task;

public class sumofdigitsinString {

	public static void main(String[] args) {
		String s="java123is#*look143";
		int num=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
				if(ch>='0' && ch<='9') {
					//System.out.print(ch);
					num=ch;
				}
			}
		int sum=0;
		int temp=num;
		while(temp>0) {
			sum+=temp%10;
			temp=temp/10;
		}
		System.out.print(temp);					

		}
		

	}
