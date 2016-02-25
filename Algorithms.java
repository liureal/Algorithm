package com.real.puzzle;

import oracle.net.aso.e;

import org.junit.Assert;

public class Algorithms {
	public static void main(String[] args) {
		Algorithms alg = new Algorithms();
		Assert.assertEquals(alg.isMatch("aa", "a"), false);
		Assert.assertEquals(alg.isMatch("aa", "aa"), true);
		Assert.assertEquals(alg.isMatch("aaa", "aa"), false);
		Assert.assertEquals(alg.isMatch("aa", "a*"), true);
		Assert.assertEquals(alg.isMatch("aa", ".*"), true);
		Assert.assertEquals(alg.isMatch("ab", ".*"), true);
		Assert.assertEquals(alg.isMatch("aab", "c*a*b"), true);
		Assert.assertEquals(alg.isMatch("abcd", "d*"), false);
		Assert.assertEquals(alg.isMatch("aaa", "ab*a*c*a"), true);
		Assert.assertEquals(alg.isMatch("", "."), false);
		Assert.assertEquals(alg.isMatch("aaa", "a.a"), true);
		Assert.assertEquals(alg.isMatch("", "a"), false);
		Assert.assertEquals(alg.isMatch("aaa", "a.a"), true);
		Assert.assertEquals(alg.isMatch("aaba", "ab*a*c*a"), false);
		Assert.assertEquals(alg.isMatch("abbbcd", "ab*bbbcd"), true);
		Assert.assertEquals(alg.isMatch("bbbba", ".*a*a"), true);

	}

	public boolean isMatch(String s, String p) {
		char[] origChars = s.toCharArray();
		char[] destChars = p.toCharArray();

		int origIndex = 0;
		int destIndex = 0;

		return resursive(origIndex, destIndex, origChars, destChars);

	}

	private boolean resursive(int origIndex, int destIndex, char[] origChars,
			char[] destChars) {
		if (origChars.length - origIndex == 0) {
			if (destChars.length - destIndex == 0) {
				return true;
			}
			if (destIndex + 1 < destChars.length
					&& destChars[destIndex + 1] == '*'
					&& (resursive(origIndex, destIndex + 2, origChars,
							destChars))) {
				return true;
			} else {
				return false;
			}
		} else if (destChars.length - destIndex == 0) {
			return false;
		}
		
		if (origChars[origIndex] != destChars[destIndex]
				&& destChars[destIndex] != '.'
				&& (destIndex + 1 == destChars.length || destChars[destIndex + 1] != '*')) {
			return false;
		}else {
			if (destIndex + 1 < destChars.length && destChars[destIndex + 1] == '*') {
				// '.*'这样的形式，后续只要间隔'*'并以星号结尾就满足条件
//				if (destChars[destIndex] == '.') {
//					if (resursive(origChars.length, destIndex, origChars, destChars)) {
//						return true;
//					}
//				}
				// 如果当前位置符号不相同，'*'代表的一定是0个
				if (destChars[destIndex] != origChars[origIndex] && destChars[destIndex] != '.') {
					return resursive(origIndex, destIndex + 2, origChars, destChars);
				}
				// i表示'*'代表的次数
				int i = 0;
				while (i < origChars.length - origIndex) {
					if (origChars[origIndex + i] != destChars[destIndex] && destChars[destIndex] != '.') 
						break;
					if (resursive(origIndex + i, destIndex + 2, origChars, destChars)) {
						return true;
					}
					i++;
				}
				return resursive(origIndex + i, destIndex + 2, origChars, destChars);
			}else {
				return resursive(origIndex + 1, destIndex + 1, origChars, destChars);
			}
		}
	}
}
