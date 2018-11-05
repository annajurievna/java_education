package lesson1.task6;

public class task6 {

	public static void main(String[] args) {
		System.out.println(negative(3));
		System.out.println(negative(0));
		System.out.println(negative(-12));
	}
	
	public static int negative(int i) {
		if (i < 0 || i == 0) return i;
		else return i - i*2;
	}

}