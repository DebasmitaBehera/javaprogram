package Practise;

public class checknoispallindrom {

	public static void main(String[] args) {
        int n=121;
        int temp=n;
        int x=0;
        
        while(n>0)  
        {
            int digit=n%10;
            x=x*10+digit;
            n=n/10;
        }
        if(temp==x)
        {
            System.out.print("pallindrome");
        }
        else
        {
            System.out.print("not");
        }

	}

}
