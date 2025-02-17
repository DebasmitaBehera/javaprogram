package Assignment;

public class PrintUniqueSentence {

		public static void main(String[] args) {
			String s="my name is debasmita jsdhsh jdjs my name is";
			String[] str = s.split(" ");
			for(int i=0;i<str.length;i++) {
				String word=str[i];
//				System.out.println(word);
				if(s.indexOf(word)==s.lastIndexOf(word)) {
					System.out.print(word +" ");
				}
				
			}

	}

}
