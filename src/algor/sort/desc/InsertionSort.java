package algor.sort.desc;

import algor.sort.SortUtil;

/**
 * (升序)先比较前两个数，如果前面比后面大则交换位置，扩大一位数范围，与前面两个数比较后，根据结果交换位置，如此类推<br/>
 * (降序)先比较前两个数，如果前面比后面小则交换位置，扩大一位数范围，与前面两个数比较后，根据结果交换位置，如此类推<br/>
 * 时间复杂度：O(n^2)
 * @author Tommy
 *
 */
public class InsertionSort {
	private int[] array;
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public InsertionSort() {
	}

	public InsertionSort(int size) {
		this.setSize(size);
		array = new int[size];
		SortUtil.createRandomArray(array, size);
	}
	
	public void sort(){
		int temp, index;
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			index = i - 1;
			while (index >= 0 && temp < array[index]) {
				array[i] = array[index];
				index--;
			}
			array[index + 1] = temp;
			System.out.println("插入排序第" + i + "步排序结果：");
			SortUtil.showArray(array);
		}
	}
}
