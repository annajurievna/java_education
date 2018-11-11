package lesson2.task2;

import java.lang.reflect.Method;

public class MethodsAuthor {

	public static void main(String[] args){
		Class clz=Author.class;
		Method[] methods = clz.getMethods();
		for(Method method : methods){
		    System.out.println(method.getName());
		}
	}

}
