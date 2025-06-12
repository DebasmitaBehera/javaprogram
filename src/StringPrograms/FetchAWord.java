package StringPrograms;

import java.util.Arrays;

public class FetchAWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="IBMadfgdbIBM IBM IBM IBM IBM".toLowerCase();
        String s1="ibm";
        int count=0;
        for(int i=0;i<s.length()-2;i++){
            String substr=s.substring(i,i+3);
            char c[]=s1.toCharArray();
            char ch[]=substr.toCharArray();
            Arrays.sort(c);
            Arrays.sort(ch);
            if(Arrays.equals(c,ch))
            {
                count++;
            }  
        }
        System.out.print("count = "+count);
    }
}

