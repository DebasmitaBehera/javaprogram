package Practise;

public class countofCharacter {

	public static void main(String[] args) {
        String s="my name is is debaasmitta";
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i]==c[j]){
                    c[j]='@';
                }
            }
            if(c[i]!='@'){
                System.out.print(c[i]);
            }
            
        }

	}

}
