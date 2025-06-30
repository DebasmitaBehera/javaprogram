package Practise;

public class reversealternavewords {

	public static void main(String[] args) {
		String s="my name is debasmita ";
		String str[]=s.split(" ");
		StringBuilder b=new StringBuilder();
		for(int i=0;i<str.length;i++) {
			if(i%2==1) {
				b.append(new StringBuilder(str[i]).reverse()+" ");
			}else
				b.append(str[i]+" ");
		}
System.out.println(b);
	}

}
