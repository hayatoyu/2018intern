package exercise9;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {5,18,37,0,121,73,3};
		BubbleSort(nums);
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
		}
	}

	// 氣泡排序法
	public static void BubbleSort(int[] nums) {
		boolean swap;
		for(int i = 0;i < nums.length; i++) {
			swap = false;
			for(int j = 0; j < nums.length - i - 1; j++) {
				if(nums[j] > nums[j + 1]) {
					swap = true;
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
			if (!swap)
				return;
		}
	}
}
