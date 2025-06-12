package Practise;

import java.util.Scanner;

public class countvowels {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      System.out.print("enter");
      String w=scanner.nextLine();
      int count=0;
      String vowels="aeiouAEIOU";
      for(int i=0;i<w.length();i++){
          if(vowels.indexOf(w.charAt(i)) != -1);
          count++;
      }

   System.out.print("no of vowels"+count);

	}

}
