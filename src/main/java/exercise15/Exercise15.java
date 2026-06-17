package exercise15;

public class Exercise15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort sort = new Sort();
		Integer[] array1 = new Integer[] {3,8,10,2,7,5,9,6,78,56,34};
		String[] array2 = new String[] {"Alex", "Mike", "Eric", "Bob", "Tina", "David", "Leo", "Judy"};
 		array1 = sort.quickSort(array1);
 		array2 = sort.quickSort(array2);
		
		System.out.println("Array1 經過排序後依序為：");
		for(int i = 0;i < array1.length; i++) {
			System.out.print(array1[i] + "\t");
		}
		System.out.print("\nArray2 經過排序後依序為：\n");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + "\t");
		}
	}

}
