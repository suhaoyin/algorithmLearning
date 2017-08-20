package algor.sort.desc;

import algor.sort.SortUtil;

public class MergeSort {
	private int[] array;
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public MergeSort() {
	}

	public MergeSort(int size) {
		this.size = size;
		array = new int[size];
		SortUtil.createRandomArray(array, size);
	}

	public void sort() {
		mergeSort(array, 0, size - 1);
		SortUtil.showArray(array);
	}

	private void mergeSort(int[] arr, int left, int right) {
		if (left >= right) {
			return;
		}
		int mid = (left + right) / 2;
		mergeSort(arr, left, mid);
		mergeSort(arr, mid + 1, right);
		mergeSort(arr, left, mid, right);
	}

	private void mergeSort(int[] arr, int left, int center, int right) {
		// 临时数组
		int[] tmpArr = new int[size];
		// 右数组第一个元素索引
		int mid = center + 1;
		// third 记录临时数组的索引
		int third = left;
		// 缓存左数组第一个元素的索引
		int tmp = left;
		while (left <= center && mid <= right) {
			// 从两个数组中取出最小的放入临时数组
			if (arr[left] <= arr[mid]) {
				tmpArr[third++] = arr[left++];
			} else {
				tmpArr[third++] = arr[mid++];
			}
		}
		// 剩余部分依次放入临时数组（实际上两个while只会执行其中一个）
		while (mid <= right) {
			tmpArr[third++] = arr[mid++];
		}
		while (left <= center) {
			tmpArr[third++] = arr[left++];
		}
		// 将临时数组中的内容拷贝回原数组中
		// （原left-right范围的内容被复制回原数组）
		while (tmp <= right) {
			arr[tmp] = tmpArr[tmp++];
		}
	}
}
