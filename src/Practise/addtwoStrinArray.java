package Practise;

import java.util.Arrays;

public class addtwoStrinArray {

	public static void main(String[] args) {
	    
	        String s[]={"apple","banana","litchi"};
	        String s1[]={"orange","guava","pineapple"};
	        String s2[]=new String[s.length+s1.length];
	        for(int i=0;i<s.length;i++){
	            s2[i]=s[i];
	        }
	        for(int i=0;i<s1.length;i++){
	            s2[s1.length+i]=s1[i];
	        }
	        for(String elements:s2){
	            System.out.println(elements);
	            
	        }
	        System.out.print(Arrays.toString(s2));


	}

}
