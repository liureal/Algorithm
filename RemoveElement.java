public class RemoveElement {
	public static int removeElement(int[] nums, int val) {
		if (nums == null) {
			return 0;
		}
		if (nums.length == 0) {
			return 0;
		}
		int count = nums.length;
		int lastIndex = nums.length;
		int removeIndex = -1;
		while (true) {
			while (++removeIndex < lastIndex) {
				if (nums[removeIndex] == val) {
					count--;
					break;
				}
			}
			while (--lastIndex > removeIndex) {
				if (nums[lastIndex] != val) {
					break;
				} else {
					count--;
				}
			}
			if (lastIndex > removeIndex) {
				nums[removeIndex] = nums[lastIndex];
			} else {
				return count;
			}
		}
	}
}
