package Practise;

public class removeSpctCharcAndRev {

	public static void main(String[] args) {
        String s="ABGhjhg@!#1234";
 String res="";
 for(int i=0;i<s.length();i++){
     char ch=s.charAt(i);
     if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
        System.out.print(ch);
        res=res+ch;
}}
 
 StringBuilder b=new StringBuilder(res);
 StringBuilder rev=b.reverse();
 System.out.println(rev);
	}

}
