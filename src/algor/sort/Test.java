package algor.sort;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		SortFacade facade = new SortFacade(theSize());
		facade.useBubble();
		System.out.println("====================================");
		facade.useSelection();
		System.out.println("====================================");
		facade.useInsertion();
		System.out.println("====================================");
		facade.useQuick();
		System.out.println("====================================");
		facade.useMerge();
		System.out.println("====================================");
		facade.useShell();
	}
	
	private static int theSize(){
		System.out.println("数组长度？");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		scanner.close();
		return size;
	}
}
