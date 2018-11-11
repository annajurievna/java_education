package lesson2.task2;

import java.util.List;

public class BookManyAuthors {
	private String name;
	private List<Author> authors;
	private double price;
	
	public String getName() {
        return name;
    }
    
    public List<Author> getAuthor() {
        return authors;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public BookManyAuthors(String name, List<Author> authors, double price) {
    	this.name = name;
    	this.authors = authors;
    	this.price = price;
    }
    
    public String toString() {
    	String res = "";
    	for (Author a: authors) {
    		res += a.toString() + " ";
    		}
    	return "Book[name=" + name + ",price=" + price + ",authors=" + res + "]";
    }
}
