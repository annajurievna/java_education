package lesson3.task1;

import java.awt.List;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import lesson2.task3.Employee;

public class out {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		while(true) {
			String s = scan.nextLine();
			if(s.equals("exit") || s.equals("quit") || s.equals("close")) break;
			else {
				list.add(s);
			}
		}
		Collections.sort(list);
		try (PrintWriter writer = new PrintWriter("Untitled.txt")) {
			for (String s: list) {
			    writer.println(s);
			}
			writer.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		
		
    }
}