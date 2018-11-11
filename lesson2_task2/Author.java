package lesson2.task2;

import java.lang.reflect.Method;

public class Author {
	private String name;
    private String email;
    private char gender;

    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public char getGender() {
        return gender;
    }
    
    public void setName(String radius) {
        this.name = name;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setGender(char gender) {
        this.gender = gender;
    }
    
    public String toString() {
    	return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }
    
    public Author(String name, String email, char gender) {
    	this.name = name;
    	this.email = email;
    	this.gender = gender;
    }

}
