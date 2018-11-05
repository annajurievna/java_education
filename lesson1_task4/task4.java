package lesson1.task4;

import java. util. Arrays;

public class task4 {
	

	public static void main(String[] args) {
		delDuplicates(new int[] {1, 1, 1, 2, 1, 3, 3});
		delDuplicates(new int[] {});
	}
	
	public static int[] delDuplicates(int[] arr) {
		if(arr.length == 0) return new int[0];
		if(arr.length == 1) return arr;
	    Arrays.sort(arr);
	    int countElements = 1;
	    for(int i = 1; i < arr.length; i++){
	        if(arr[i - 1] != arr[i]){
	        	countElements++;
	        }
	    }
	    int[] arrNoDuplicates = new int[countElements];
	    int j = 0;
	    if(arrNoDuplicates.length > 0){
	    	arrNoDuplicates[j] = arr[0];
	    	j++;
	    }
	    for(int i = 1; i < arr.length; i++){
	        if(arr[i - 1] != arr[i]){
	        	arrNoDuplicates[j] = arr[i];
	        	j++;
	        }
	    }
	    for (int v : arrNoDuplicates)
	        System.out.print(v + " ");
		return arrNoDuplicates;
	}
}

