package Practise;

public class replaceawithsymbl {

	public static void main(String[] args) {
        String s="i am beautifual";
        int count=0;
        String output="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'){
                count++;
                for(int j=0;j<count;j++){
                    output+="@";
                }
                
            }
            else{
                output+=c;
            }
        }
        System.out.print(output);

	}

}
