import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneNumber {
	public static List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<String>();
		char[] c = digits.toCharArray();
		for (int i = 0; i < c.length; i++) {
			List<String> perNum = new ArrayList<String>();
			switch (c[i]) {
			case '2':
				perNum = Arrays.asList("a", "b", "c");
				break;
			case '3':
				perNum = Arrays.asList("d", "e", "f");
				break;
			case '4':
				perNum = Arrays.asList("g", "h", "i");
				break;
			case '5':
				perNum = Arrays.asList("j", "k", "l");
				break;
			case '6':
				perNum = Arrays.asList("m", "n", "o");
				break;
			case '7':
				perNum = Arrays.asList("p", "q", "r", "s");
				break;
			case '8':
				perNum = Arrays.asList("t", "u", "v");
				break;
			case '9':
				perNum = Arrays.asList("w", "x", "y", "z");
				break;
			default:
				break;
			}
			if (result.isEmpty()) {
				result = perNum;
				continue;
			}
			List<String> newList = new ArrayList<String>();
			for (String string : result) {
				for (String cha : perNum) {
					newList.add(string + cha);
				}
			}
			result = newList;
			
		}
		return result;
    }
}
