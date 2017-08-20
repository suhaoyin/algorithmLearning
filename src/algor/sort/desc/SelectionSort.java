package algor.sort.desc;

import algor.sort.SortUtil;

/**
 * (升序)先在0到n-1范围中找出最小的数与0位置的数交换，然后是1到n-1范围，如此类推<br/>
 * (降序)先在0到n-1范围中找出最大的数与0位置的数交换，然后是1到n-1范围，如此类推<br/>
 * 时间复杂度：O(n^2)
 * @author Tommy
 *
 */
public class SelectionSort {
	private static int[] array;
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public SelectionSort() {
	}

	public SelectionSort(int size) {
		this.setSize(size);
		array = new int[size];
		SortUtil.createRandomArray(array, size);
	}

	public void sort(){
		int min;
		for(int i=0;i<array.length-1;i++){
			min = i;
			for(int k=i+1;k<array.length;k++){
				if(array[k]<array[min])
					min = k;
			}
			if (min!=i) {
				SortUtil.exchange(array, min, i);
			}
			System.out.println("选择排序第" + (i+1) + "步排序结果：");
			SortUtil.showArray(array);
		}
	}
}
