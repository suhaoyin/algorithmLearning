package algor.sort;

public class SortUtil {

	/**
	 * 可用于常规的交换
	 * 
	 * @param arr
	 * @param a
	 * @param b
	 */
	public static void exchange(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void createRandomArray(int[] arr, int size) {
		for (int i = 0; i < size; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}
	}
	
	public static void showArray(int[] array) {
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
