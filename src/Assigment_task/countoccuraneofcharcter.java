package Assigment_task;

public class countoccuraneofcharcter {

	public static void main(String[] args) {
		String s="Resources";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			int count=1;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					c[j]='@';
					count++;
				}
			}
			if(c[i]!='@') {
				System.out.println(c[i]+""+count);
			}
		}

	}

}
