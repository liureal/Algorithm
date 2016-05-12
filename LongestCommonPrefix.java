public class LongestCommonPrefix {
	// "aa"
	// "aaa"
	// "baaa"
	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) 
			return "";
		if (strs.length == 1) 
			return strs[0];
		
		char[] commonPrefix = strs[0].toCharArray();
		StringBuilder common = null;
		for (int i = 1; i < strs.length; i++) {
			char[] c = strs[i].toCharArray();
			common = new StringBuilder();
			for (int j = 0; j < c.length && j < commonPrefix.length; j++) {
				if (commonPrefix.length == 0 || c.length == 0) {
					return "";
				}
				if (commonPrefix[j] != c[j]) {
					break;
				}
				common.append(c[j]);
			}
			commonPrefix = common.toString().toCharArray();
		}
		return common.toString();
	}
}
