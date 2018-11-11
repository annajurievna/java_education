package lesson3.task1;

import java.util.Arrays;
import java.util.Random;

public class Exception {
    public static void main(String[] args) {
        Character[] strings = new Character[20];
        fillArray(strings);
        System.out.println(Arrays.toString(strings));
        try {
        	checkArray(strings);
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkArray(Character[] strings) {
    	for (int i = 0; i < strings.length; i++) {
    		if (!Character.isDigit(strings[i])) throw new NullPointerException("Элемент с индексом " + i + " всё испортил");
    	}
    	System.out.println("Проверка прошла");
    }

    private static void fillArray(Character[] strings) {
        Random r = new Random();
        String alphabet = "1234567890b";
        for (int i = 0; i < strings.length; i++) {
            strings[i] = Character.valueOf(alphabet.charAt(r.nextInt(alphabet.length())));
        }
    }
}