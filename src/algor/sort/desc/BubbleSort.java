package algor.sort.desc;

import algor.sort.SortUtil;

/**
 * (升序)先在0到n-1的范围中遍历两个相邻的数，前面比后面大的交换位置，接下来0到n-2,...,如此类推<br/>
 * (降序)先在0到n-1的范围中遍历两个相邻的数，前面比后面小的交换位置，接下来0到n-2,...,如此类推<br/>
 * 时间复杂度：O(n^2)
 * @author Tommy
 *
 */
public class BubbleSort {
	// 存放数据
	private static int[] array;
	// 数据量
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public BubbleSort() {
	}

	public BubbleSort(int size) {
		this.setSize(size);
		array = new int[size];
		SortUtil.createRandomArray(array, size);
	}

	public void sort() {
		for (int i = 1; i < array.length; i++) {
			for (int k = 0; k < array.length - i; k++) {
				if (array[k] > array[k + 1]) {
					SortUtil.exchange(array, k + 1, k);
				}
			}
			System.out.println("冒泡排序第" + i + "步排序结果：");
			SortUtil.showArray(array);
		}
	}

}
