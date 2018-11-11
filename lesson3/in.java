package lesson3.task1;

import java.util.Scanner;

public class in {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			String s = scan.nextLine();
			if(s.equals("exit") || s.equals("quit") || s.equals("close")) break;
		}
    }
}