package tekion;

public class prg9 {

	public static void main(String[] args) {
		String s="debasmita";
		boolean flag=false;
		for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--) {
			if(s.charAt(i)==s.charAt(j)) {
				flag=true;
				break;
			}
			
		}
			if(flag) {
				System.out.println("pallindrom");
			}else {
				System.out.println("not pallindrom");
			}
			
			
		}

	}


