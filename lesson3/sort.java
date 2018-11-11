package lesson3.task1;

import java.util.HashMap;
import java.util.Map;

public class sort {
	public static Map<String, Integer> map;
	
	public static void createDictionary() {
		map = new HashMap<String, Integer>();
		map.put("A", 0);
		for (int i = 1; i < 10; i++)
			map.put(Integer.toString(i), i);
		map.put("T", 10);
		map.put("J", 11);
		map.put("Q", 12);
		map.put("K", 13);
	}
	
	public static void main(String[] args) {
		createDictionary();
		String[] s = new String[]{"3", "9", "A", "5", "T", "8", "2", "4", "Q", "7", "J", "6", "K"};
		sortCards(s);
		for (String c: s)
			System.out.print(c + " ");
	}
	
	public static void sortCards(String[] s) {
		String c = " ";
		for (int i = s.length - 1; i >= 1; i--){  
	        for (int j = 0; j < i; j++){       
	            if(map.get(s[j]) > map.get(s[j + 1])) {
	            	c = s[j];
	            	s[j] = s[j + 1];
	            	s[j + 1] = c;
	            }      
	        }
	    }
	}
}