package lesson2.task2;

public class BookOneAuthor {
	private String name;
	private Author author;
	private double price;
	
	public String getName() {
        return name;
    }
    
    public Author getAuthor() {
        return author;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAuthor(Author author) {
        this.author = author;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public BookOneAuthor(String name, Author author, double price) {
    	this.name = name;
    	this.author = author;
    	this.price = price;
    }
    
    public String toString() {
    	return "Book[name=" + name + "," + author.toString() + ",price=" + price + "]";
    }
    
    public String getAuthorName() {
    	return this.author.getName();
    }
    
    public String getAuthorEmail() {
    	return this.author.getEmail();
    }
    
    public char getAuthorGender() {
    	return this.author.getGender();
    }
    
}


