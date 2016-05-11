public class RomanNumber {
	//I（1）、V（5）、X（10）、L（50）、C（100）、D（500）和M（1000）
	// 134 --> CXXXIV
	// 9 --> IX
	public static String intToRoman(int num){
		StringBuilder romanNum = new StringBuilder();
		int remNum = num;
		if (remNum / 1000 > 0) {
			for (int i = 0; i < remNum / 1000; i++) 
				romanNum.append("M");
			remNum = remNum % 1000;
		}
		if (remNum / 100 == 9) {
			romanNum.append("CM");
			remNum = remNum % 100;
		}else {
			if (remNum / 500 > 0) {
				romanNum.append("D");
				remNum = remNum % 500;
			}
			if (remNum / 100 > 0) {
				int rs = remNum / 100;
				if (rs == 4) {
					romanNum.append("CD");
				}else {
					for (int i = 0; i < rs; i++) {
						romanNum.append("C");
					}
				}
				remNum = remNum % 100;
			}
		}
		if (remNum / 10 == 9) {
			romanNum.append("XC");
			remNum = remNum % 10;
		}else {
			if (remNum / 50 > 0) {
				romanNum.append("L");
				remNum = remNum % 50;
			}
			if (remNum / 10 > 0) {
				int rs = remNum / 10;
				if (rs == 4) {
					romanNum.append("XL");
				}else {
					for (int i = 0; i < rs; i++) {
						romanNum.append("X");
					}
				}
				remNum = remNum % 10;
			}
		}
		if (remNum == 9) {
			romanNum.append("IX");
		}else {
			if (remNum / 5 > 0) {
				romanNum.append("V");
				remNum = remNum % 5;
			}
			if (remNum == 4) {
				romanNum.append("IV");
			}else {
				for (int i = 0; i < remNum; i++) {
					romanNum.append("I");
				}
			}
		}

		return romanNum.toString();
	}
}
