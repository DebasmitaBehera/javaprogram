package Practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashMapIterations {

	public static void main(String[] args) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        map.put('a',1);
        map.put('b',5);
        map.put('c',2);
        map.put('g',5);
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            System.out.println(e.getValue()+" "+e.getKey());
        }

	}

}
