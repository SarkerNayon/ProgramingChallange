package javaChalenges;

import java.util.HashMap;
import java.util.Map;

public class Q1_find_hashMap {
	
		public static void main(String[] args) {

	MyClass1 obj1 = new MyClass1(); 
	MyClass2 obj2 = new MyClass2();
	MyClass2 obj3 = new MyClass2();
	

	Map<Object, String> hMap = new HashMap<>();
	
	Map<Object, Integer> hMap1 = new HashMap<>(); 


	//hMap.put(obj1, "sakir" , obj3); hMap.put(obj2, "Boss"); 
	hMap1.put(obj3 , 99); hMap1.put(obj2, 100); 

	System.out.println("size=" + hMap1.get(obj2) + hMap1.get(obj3));
	 }

}
