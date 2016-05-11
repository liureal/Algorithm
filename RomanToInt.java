public class RomanToInt {
	//I（1）、V（5）、X（10）、L（50）、C（100）、D（500）和M（1000）
	// IX XC CM
	public static int romanToInt(String s) {
		char[] c = s.toCharArray();
		int value = 0;
		for (int i = c.length - 1; i >= 0; i--) {
			if (c[i] == 'M') {
				value += 1000;
			}
			if (c[i] == 'D') {
				value += 500;
			}
			if (c[i] == 'C') {
				if (value / 500 > 0) 
					value -= 100;
				else 
					value += 100;
			}
			if (c[i] == 'L') {
				value += 50;
			}
			if (c[i] == 'X') {
				if (value / 50 > 0)
					value -= 10;
				else
					value += 10;
			}
			if (c[i] == 'V') {
				value += 5;
			}
			if (c[i] == 'I') {
				if (value / 5 > 0)
					value -= 1;
				else
					value += 1;
			}
		}
        return value;
    }
}
