package LambdaExp;

import java.util.HashMap;

public class LearningBiConsumer {

	public static void main(String[] args) {
		HashMap hs=new HashMap();
		hs.put("Dhoni", 7);
		hs.put("Rohit", 45);
		hs.put("Virat", 18);
		hs.forEach((key,value)->{System.out.println(key+"-"+value);});

	}

}
