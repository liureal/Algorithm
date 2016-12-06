import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	public static List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<String>();
		boolean[] position = new boolean[2 * n];
		recursive(0, 0, n, position, result);
        return result;
    }
	
	private static void recursive(int index, int point, int max, boolean[] position, List<String> result){
		boolean isOver = false;
		if (index == max - 1) 
			isOver = true;
		
		for (int i = point; i < 2 * index + 1; i++) {
			position[i] = true;
			if (isOver) {
				StringBuilder str = new StringBuilder();
				for (int l = 0; l < position.length; l++) {
					if (position[l]) {
						str.append("(");
					}else {
						str.append(")");
					}
				}
				result.add(str.toString());
			}else {
				recursive(index + 1, i + 1, max, position, result);
			}
			position[i] = false;
		}
	}
	
}
