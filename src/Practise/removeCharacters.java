package Practise;

public class removeCharacters {

	public static void main(String[] args) {
        String s="ABGhjhg@!#1234";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9'))){
                System.out.print(ch);
                
            }
            
        }

	}

}
