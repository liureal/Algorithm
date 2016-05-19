import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4 {
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (nums.length < 4) {
			return result;
		}
		Arrays.sort(nums);
		int leftPos = 0;
		while (leftPos < nums.length -3) {
			int rightPos = nums.length - 1;
			while (rightPos > 2) {
				int leftIndex = leftPos + 1;
				int rightIndex = rightPos - 1;
				while (leftIndex < rightIndex) {
					int sum = nums[leftPos] + nums[leftIndex] + nums[rightIndex] + nums[rightPos];
					if (sum == target) 
						result.add(Arrays.asList(nums[leftPos], nums[leftIndex], nums[rightIndex], nums[rightPos]));
					if (sum <= target) 
						while(nums[leftIndex] == nums[++leftIndex] && leftIndex < rightIndex);
					if (sum >= target) 
						while(nums[rightIndex] == nums[--rightIndex] && leftIndex < rightIndex);
				}
				while(nums[rightPos] == nums[--rightPos] && rightPos > 2);
			}
			while(nums[leftPos] == nums[++leftPos] && leftPos < nums.length -3);
		}
        return result;
    }
}
