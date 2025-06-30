package Practise;

public class printuniqueusingforloop {

	public static void main(String[] args) {
        String s="my name is debasmita my name is ";
        String s1[]=s.split(" ");
        for(int i=0;i<s1.length;i++){
             int count=1;
            for(int j=i+1;j<s1.length;j++)
            {
                if(s1[i].equals(s1[j]))
                {
                    
                    s1[j]=" ";
                    count++;
                }
}
if(!s1[i].equals(" ") && count==1)
{
System.out.print(s1[i]+" "+count);

	}

}

	}

}
