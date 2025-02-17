package Map;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(2433, "Value1");
		map.put(3555, "Value2");
		map.put(32566, "cvds");
		//System.out.println(map);
		HashMap map1=new HashMap();
		map.put(7655, "Value1");
		map.put(997888, "Value2");
		map.put(9884, "cvds");
		map.putAll(map1);
		System.out.println(map);	
		/*System.out.println(map.containsKey(32566));
		System.out.println(map.containsValue("Value2"));
		System.out.println(map.values());//all the values
		System.out.println(map.keySet());//all the keys*/
		map.replace(32566, "hghxa");
		System.out.println(map);
		map.replace(32566, "hghxa","kashi");
		System.out.println(map);
		map.remove(3555,"cvds");
		System.out.println(map);

	}
	

}
