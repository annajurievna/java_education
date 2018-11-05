package lesson1.task11;

public class task11 {

	public static void main(String[] args) {
		int[][] arr1 = new int[][]{{1,2,3},
		       {4,5,6},
		       {7,8,9}};
		int[][] arr2 = new int[0][0];
		printArr(arr1);
		printArr(arr2);
	}
	
	public static void printArr(int[][] arr) {
		if (arr.length == 0) return;
		int len = arr.length;
		int currentSize = len;
		int[] result = new int[len*len];
		int start_i = 0;
		int start_j = 0;
		int k = 0;
		while (currentSize > 0) {
			if (currentSize == 1) {
				result[k] = arr[start_i][start_j];
				break;
			}
			else {
				if (currentSize == 2) {
					result[k++] = arr[start_i][start_j];
					result[k++] = arr[start_i][start_j + 1];
					result[k++] = arr[start_i + 1][start_j + 1];
					result[k] = arr[start_i + 1][start_j];
					break;
				}
				else {
					for (int j = start_j; j < start_j + currentSize; j++) {
						result[k++] = arr[start_i][j];
					}
					for (int i = start_i + 1; i < start_i + currentSize; i++) {
						result[k++] = arr[i][start_j + currentSize - 1];
					}
					for (int j = start_j + currentSize - 2; j >= start_j; j--) {
						result[k++] = arr[start_i + currentSize - 1][j];
					}
					for (int i = start_i + currentSize - 2; i > start_i; i--) {
						result[k++] = arr[i][start_j];
					}
					start_i++;
					start_j++;
					currentSize = currentSize - 2;
				}
			}
			
		}
		for (int v : result)
	        System.out.print(v + " ");
	}
}
