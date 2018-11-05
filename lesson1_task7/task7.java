package lesson1.task7;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class task7 {

	public static void main(String[] args) {
		System.out.println(containsRepeat("Актива"));
		System.out.println(containsRepeat("Мышь"));
	}
	
	public static Boolean containsRepeat(String s) {
		char[] charArray = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			charArray[i] = s.charAt(i);
		}
		Boolean res = false;
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (Character.compare(Character.toLowerCase(charArray[i]), Character.toLowerCase(charArray[j])) == 0) {
					res = true;
					break;
				}
			}
		}
		return res;
		
	}

}