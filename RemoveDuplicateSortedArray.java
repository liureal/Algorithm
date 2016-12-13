public class RemoveDuplicateSortedArray {
	public static int removeDuplicates(int[] nums) {
		if (nums == null) {
			return 0;
		}
		if (nums.length == 0 || nums.length == 1) {
			return nums.length;
		}

		int count = 1;
		int lastNum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (lastNum != nums[i]) {
				lastNum = nums[i];
				nums[count] = lastNum;
				count++;
			}
		}
		return count;
	}
}
