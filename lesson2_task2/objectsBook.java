package lesson2.task2;

import java.util.ArrayList;
import java.util.List;

public class objectsBook {
	
	public static void main(String[] args){
		Author a = new Author("Emily Bronte", "emily@yandex.ru", 'f');
		BookOneAuthor bk = new BookOneAuthor("Wuthering heights", a, 12345);
		System.out.println(bk.getAuthor().getName());
		System.out.println(bk.getAuthor().getEmail());
		System.out.println(bk.getAuthorName());
		System.out.println(bk.getAuthorEmail());
		System.out.println(bk.getAuthorGender());
		
		Author b = new Author("Charlotte Bronte", "charlotte@gmail.com", 'f');
		List<Author> listOfAuthors= new ArrayList<Author>();
		listOfAuthors.add(a);
		listOfAuthors.add(b);
		BookManyAuthors bk2 = new BookManyAuthors("Wuthering heights", listOfAuthors, 6789);
		System.out.println(bk2.toString());
	}

}