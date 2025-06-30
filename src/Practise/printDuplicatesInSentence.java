package Practise;

import java.util.HashMap;
import java.util.Map.Entry;

public class printDuplicatesInSentence {

	public static void main(String[] args) {
        String s="my name is debasmita name is debasmita the";
        String[] s1=s.split(" ");
        HashMap<String,Integer> map=new  HashMap<String,Integer>();
        for(int i=0;i<s1.length;i++){
            String w=s1[i];
            if(map.containsKey(w)){
                map.put(w,map.get(w)+1);
            }else
            map.put(w,1);
        }

for(Entry<String,Integer> e:map.entrySet()){
    if(e.getValue()==1){
        System.out.println(e.getKey()+" : "+e.getValue());
    }
}
     }       }
        

