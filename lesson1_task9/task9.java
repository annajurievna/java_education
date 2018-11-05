package lesson1.task9;

public class task9 {

	public static void main(String[] args) {
		System.out.println(format(50));
		System.out.println(format(90));
		System.out.println(format(3640));
		System.out.println(format(-2));
		System.out.println(format(0));
	}
	
	public static String format(int i) {
		if (i <= 0) return "0 секунд";
	    int hour = i / 3600;
	    int left = i - hour * 3600;
	    int min = left / 60;
	    left = left - min * 60;
	    int sec = left;
	    String s = "";
	    if (hour > 0) s = s + hour + " часов ";
	    if (min > 0) s = s +  min + " минут ";
	    if (sec > 0) s = s + sec + " секунд";
	    return s;
	}

}