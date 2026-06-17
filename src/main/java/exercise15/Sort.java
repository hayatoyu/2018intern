package exercise15;

public class Sort {
	
	/*
	public int[] QuickSort(int[] array) {
		if (array.length < 2)
			return array;
		sort(array, 0, array.length - 1);
		return array;
	}
	
	private void sort(int[] array, int left, int right) {
		if (left >= right)
			return;
		int pivotIdx = left + (right - left) / 2;
		int pivot = array[pivotIdx];
		
		int i = left, j = right;
		
		while (i <= j) {
			while (array[i] < pivot)
				i++;
			while (array[j] > pivot)
				j--;
			if (i <= j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}
		if (left < j)
			sort(array, left, j);
		if (i < right)
			sort(array, i ,right);
	}
	*/
	
	public <T extends Comparable<T>> T[] quickSort(T[] array) {
		if (array == null || array.length < 2) {
			return array;
		}
		sort(array, 0, array.length - 1);
		return array;
	}
	
	private <T extends Comparable<T>> void sort(T[] array, int left, int right) {
		if (left >= right)
			return;
		int pivotIdx = left + (right - left) / 2;
		T pivot = array[pivotIdx];
		
		int i = left, j = right;
		
		while (i <= j) {
			while (array[i].compareTo(pivot) < 0)
				i++;
			while(array[j].compareTo(pivot) > 0)
				j--;
			
			if (i <= j) {
				T temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}
		if (left < j)
			sort(array,left,j);
		if (i < right)
			sort(array,i,right);
	}
}
