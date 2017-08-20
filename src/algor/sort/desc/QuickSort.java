package algor.sort.desc;

import algor.sort.SortUtil;

public class QuickSort {

	private int[] array;
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public QuickSort() {
	}

	public QuickSort(int size) {
		this.size = size;
		array = new int[size];
		SortUtil.createRandomArray(array, size);
	}

	public static int partion(int[] array, int start, int end) {
		int key = array[start];
		while (start < end) {
			while (start < end && key <= array[end])
				end--;
			array[start] = array[end];
			while (start < end && key >= array[start])
				start++;
			array[end] = array[start];
		}
		array[start] = key;
		return start;

	}

	public void quickSort(int start, int end) {
		if (start < end) {
			int rem = partion(array, start, end);
			quickSort(start, rem - 1);
			quickSort(rem + 1, end);
		}
	}
	
	public void sort(){
		quickSort(0, size-1);
		SortUtil.showArray(array);
	}
}
