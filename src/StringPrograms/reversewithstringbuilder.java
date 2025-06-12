package StringPrograms;

public class reversewithstringbuilder {

	public static void main(String[] args) {
        String s="hello";
        StringBuilder builder=new StringBuilder(s);
        
        StringBuilder r = builder.reverse();
        for(int i=0;i<r.length();i++) {
        	System.out.println(r.substring(0,r.length()-i));
        }
        

	}

}
