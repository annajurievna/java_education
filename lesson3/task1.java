package lesson3.task1;

public class task1 {
	public static void main(String[] args) {
        // Напишите один единственый метод который бы умел складывать все чиловые типы данных
        Double aDouble = 10.2D;
        Float aFloat = 7.8F;
        Long aLong = 12L;
        Integer integer = 10;
        Short aShort = 12;
        Byte aByte = 127;
        System.out.println(sum(aDouble, aDouble));
        System.out.println(sum(aDouble, aFloat));
        System.out.println(sum(aDouble, aLong));
        System.out.println(sum(aDouble, integer));
        System.out.println(sum(aDouble, aShort));
        System.out.println(sum(aDouble, aByte));
        System.out.println(sum(aFloat, aFloat));
        System.out.println(sum(aFloat, aLong));
        System.out.println(sum(aFloat, integer));
        System.out.println(sum(aFloat, aShort));
        System.out.println(sum(aFloat, aByte));
        System.out.println(sum(aLong, aLong));
        System.out.println(sum(aLong, integer));
        System.out.println(sum(aLong, aShort));
        System.out.println(sum(aLong, aByte));
        System.out.println(sum(integer, integer));
        System.out.println(sum(integer, aShort));
        System.out.println(sum(integer, aByte));
        System.out.println(sum(aShort, aShort));
        System.out.println(sum(aShort, aByte));
        System.out.println(sum(aByte, aByte));    
    }
	
	public static<T extends Number> T sum(T a, T b) { 
		Double res = a.doubleValue() + b.doubleValue();
		return (T) res; 
	}
}
