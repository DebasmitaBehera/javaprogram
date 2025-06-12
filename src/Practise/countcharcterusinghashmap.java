package Practise;

import java.util.HashMap;
import java.util.Map.Entry;

public class countcharcterusinghashmap {

	public static void main(String[] args) {
        String s="aaabbbbggggcv";
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        for(Entry<Character,Integer> e:map.entrySet()){
            if(e.getValue()>0){
                System.out.print(e.getKey()+"="+e.getValue());
            }
        }

	}

}
