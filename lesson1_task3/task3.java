package lesson1.task3;

public class task3 {

	public static void main(String[] args) {
		System.out.println(sayHello("олег")); 
		System.out.println(sayHello("ДЕНИС")); 
		System.out.println(sayHello("")); 
	}
	
	public static String sayHello(String s) {
		String helloString;
		if(s.equals("")) {
			helloString = "Привет!";
		}
		else {
			helloString = "Привет " + s + "!";
		}
		return helloString;
		
	}

}