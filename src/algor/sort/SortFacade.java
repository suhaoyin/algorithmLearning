package algor.sort;

import algor.sort.desc.BubbleSort;
import algor.sort.desc.InsertionSort;
import algor.sort.desc.MergeSort;
import algor.sort.desc.QuickSort;
import algor.sort.desc.SelectionSort;
import algor.sort.desc.ShellSort;

public class SortFacade {

	private BubbleSort bubbleSort;
	private SelectionSort selectionSort;
	private InsertionSort insertionSort;
	private QuickSort quickSort;
	private MergeSort mergeSort;
	private ShellSort shellSort;

	public SortFacade() {
		bubbleSort = new BubbleSort(10);
		selectionSort = new SelectionSort(10);
		insertionSort = new InsertionSort(10);
	}

	public SortFacade(int size) {
		bubbleSort = new BubbleSort(size);
		selectionSort = new SelectionSort(size);
		insertionSort = new InsertionSort(size);
		quickSort = new QuickSort(size);
		mergeSort = new MergeSort(size);
		shellSort = new ShellSort(size);
	}

	public void useBubble() {
		bubbleSort.sort();
	}
	
	public void useSelection() {
		selectionSort.sort();
	}
	
	public void useInsertion(){
		insertionSort.sort();
	}
	
	public void useQuick(){
		quickSort.sort();
	}
	
	public void useMerge(){
		mergeSort.sort();
	}
	
	public void useShell(){
		shellSort.sort();
	}
}
