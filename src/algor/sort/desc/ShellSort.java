package algor.sort.desc;

import algor.sort.SortUtil;

public class ShellSort {
	private int[] array;
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public ShellSort() {
	}

	public ShellSort(int size) {
		this.size = size;
		array = new int[size];
		SortUtil.createRandomArray(array, size);
	}

	public void sort() {
		int temp, index;
		for (int range = array.length / 2; range >= 1; range = range / 2) {
			for (int i = range; i < array.length; i++) {
				temp = array[i];
				index = i - range;
				while (index >= 0 && temp < array[index]) {
					array[index + range] = array[index];
					index = index - range;
				}
				array[index + range] = temp;
			}
			SortUtil.showArray(array);
		}
	}
}
