import java.util.Arrays;

public class Closest3Sum {
	public static int threeSumClosest(int[] nums, int target) {
		if (nums.length < 4) {
			int sum = 0;
			for (int i = 0; i < nums.length; i++) {
				sum += nums[i];
			}
			return sum; 
		}
		Arrays.sort(nums);
		int leftPos = 0;
		int sumTarget = nums[0] + nums[1] + nums[2];
		while (leftPos < nums.length - 2) {
			int leftInd = leftPos + 1;
			int rightInd = nums.length - 1;
			while (leftInd < rightInd) {
				int sum = nums[leftPos] + nums[leftInd] + nums[rightInd];
				if (sum == target) 
					return target;
				if (sum < target) {
					if (Math.abs(sum - target) < Math.abs(sumTarget - target)) {
						sumTarget = sum;
					}
					while(nums[leftInd] == nums[++leftInd] && leftInd < rightInd);
				}
				if (sum > target) {
					if (Math.abs(sum - target) < Math.abs(sumTarget - target)) {
						sumTarget = sum;
					}
					while(nums[rightInd] == nums[--rightInd] && leftInd < rightInd);
				}
			}
			while(nums[leftPos] == nums[++leftPos] && leftPos < nums.length - 2);
		}
		return sumTarget;
	}
	
}
