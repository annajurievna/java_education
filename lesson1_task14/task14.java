package lesson1.task14;

public class task14 {
	static Integer a = new Integer(1);
	static Integer b = new Integer(2);
	
	public static void main(String[] args) {
		invoke();
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
	public static void invoke() {
		a=a+b-(b=a);
	}
}