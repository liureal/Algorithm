public class Sum3 {
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (nums.length < 3) {
			return result; 
		}
		Arrays.sort(nums);
		int leftPos = 0;
		while (leftPos < nums.length - 2) {
			int leftInd = leftPos + 1;
			int rightInd = nums.length - 1;
			while (leftInd < rightInd) {
				int sum = nums[leftPos] + nums[leftInd] + nums[rightInd];
				if (sum == 0) 
					result.add(Arrays.asList(nums[leftPos], nums[leftInd], nums[rightInd]));
				if (sum <= 0) 
					while(nums[leftInd] == nums[++leftInd] && leftInd < rightInd);
				if (sum >= 0) 
					while(nums[rightInd] == nums[--rightInd] && leftInd < rightInd);
			}
			while(nums[leftPos] == nums[++leftPos] && leftPos < nums.length - 2);
		}
		return result;
	}
}
