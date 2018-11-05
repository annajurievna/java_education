package lesson1.task5;

public class task5 {

	public static void main(String[] args) {
		System.out.println(mask("85632983256"));
		System.out.println(mask("56"));
		System.out.println(mask("3"));
		System.out.println(mask(""));
		System.out.println(mask("ierfu"));
	}
	
	public static String mask(String s) {
		if (s.length() < 2) return s;
		String sMask = "";
		for (int i = 0; i < s.length() - 2; i++) {
			sMask = sMask + "#";
		}
		sMask = sMask + s.substring(s.length() - 2, s.length());
		return sMask;
		
	}

}