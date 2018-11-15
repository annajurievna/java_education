package lesson1.task12;

public class task12 {
	public static void main(String[] args) {
		System.out.println(result("2-1")); // 1
		System.out.println(result("2+1")); // 3
		System.out.println(result("2- +1")); // 1
		System.out.println(result("2- -1")); // 3
		System.out.println(result("2+ -1")); // 1
		System.out.println(result("2+ +1")); // 3
		} 

		private static int result(String s) { 
			int res = 0;
			if (s.indexOf(' ') == -1) {
				switch(s.charAt(1)) {
				case '-':
					res = Character.getNumericValue(s.charAt(0)) - Character.getNumericValue(s.charAt(2));
					break;
				case '+':
					res = Character.getNumericValue(s.charAt(0)) + Character.getNumericValue(s.charAt(2));
					break;
				}
			}
			else {
				if (s.charAt(1) == s.charAt(3)) {
					res = Character.getNumericValue(s.charAt(0)) + Character.getNumericValue(s.charAt(4));
				}
				else {
					res = Character.getNumericValue(s.charAt(0)) - Character.getNumericValue(s.charAt(4));
				}
			}
			return res;
		}
}


/**
 * Напишите метод который принимает математическое выражение в формате String и возвращает результат.
 * В выражении используются только целые числа, поддерживаемые операции:+,-.
 * Пример:
 * 	math("2-1"); // вернёт [1]
 * 	math("2- +1"); // вернёт [1]
 * 	math(" 2-  -1"); // вернёт [3]
 */
