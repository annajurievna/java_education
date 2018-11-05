package lesson1.task10;

public class task10 {

	public static void main(String[] args) {
		System.out.println(format("9136758070"));
	}
	
	public static String format(String tel) {
		return "+7 (" + tel.substring(0, 3) + ") " +  tel.substring(3, 6) + "-" + tel.substring(6, 8) + "-" + tel.substring(8, 10);
	}

}