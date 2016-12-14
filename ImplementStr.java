public class ImplementStr {
	public static int strStr(String haystack, String needle) {
		if (haystack == null) {
			return -1;
		}
		if (needle == null) {
			return -1;
		}
		char[] dest = haystack.toCharArray();
		char[] need = needle.toCharArray();
		if (need.length == 0) {
			return 0;
		}
		if (dest.length == 0) {
			return -1;
		}
		int pointer = -1;
		int mark = 0;
		int destIndex = 0;
		while (destIndex < dest.length) {
			if (dest[destIndex++] != need[++pointer]) {
				pointer = -1;
				mark++;
				destIndex = mark;
			}
			if (pointer == needle.length() - 1) {
				return destIndex - pointer - 1;
			}
		}
		return -1;
	}
}
