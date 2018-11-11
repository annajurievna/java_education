package lesson3.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2 {
	
	public static Map<String, Integer> createDictionary(String s) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] words = s.split(" ");
		for (String word: words) {
			int i = 1;
			while (i < 10) {
			    if (word.indexOf(Integer.toString(i)) == -1) {
			    	i++;
			    }
			    else {
			    	map.put(word, i);
			    	break;
			    }
			}
		}
		return map;
	}
	
	public static void main(String[] args) {
		sort("is2 Thi1s T4est 3a");
		sort("4of Fo1r pe6ople g3ood th5e the2");
		sort("");
    }
	
	public static void sort(String s) {
		if (s.equals("")) System.out.println("");
		else {
			Map<String, Integer> map = createDictionary(s);
			String[] words = s.split(" ");
			String c = " ";
			for (int i = words.length - 1; i >= 1; i--){  
		        for (int j = 0; j < i; j++){       
		            if(map.get(words[j]) > map.get(words[j + 1])) {
		            	c = words[j];
		            	words[j] = words[j + 1];
		            	words[j + 1] = c;
		            }      
		        }
		    }
			for (String w: words)
				System.out.print(w + " ");
			System.out.println();
		}
	}
	
}