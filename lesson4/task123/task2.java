package lesson4.task123;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 5, 2);
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
	}
}
