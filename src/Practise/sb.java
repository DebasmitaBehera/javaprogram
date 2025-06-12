package Practise;

import java.util.HashMap;
import java.util.Map.Entry;

public class sb {

	public static void main(String[] args) {
        String s="aabbgggtccofffff";
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }}
            for(Entry<Character,Integer> e:map.entrySet() ){
                if(e.getValue()==1){
                    System.out.print(e.getKey()+""+e.getValue());
                }
            }

	}

}
