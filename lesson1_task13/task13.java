package lesson1.task13;

public class task13 {

	public static void main(String[] args) {
		System.out.println(format("Гуляев Гавриил Парфеньевич"));
	}
	
	public static String format(String fio) {
		int k1 = fio.indexOf(" ");
		int k2 = fio.lastIndexOf(" ");
		return fio.substring(k1 + 1, k2) + " " + fio.substring(0, k1);
	}

}