package lesson1.task8;

public class task8 {

	public static void main(String[] args) {
		System.out.println(factorial(3));
		System.out.println(factorial(-3));
		System.out.println(factorial(0)); //Факториал 0 равен 1, а не 0
	}

	
	public static int factorial(int i) {
        if (i == 0) return 1;
        if (i < 0) return 0;
        return i * factorial(i-1);
    }

}
