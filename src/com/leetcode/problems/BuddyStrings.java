package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class BuddyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A = "baa";

		String B = "aa";

		int[] count = new int[26];
		
		count[A.charAt(0)- 'a']++;
		System.out.println(A.charAt(0) - 'a');

		if (A.length() == B.length()) {
			System.out.println("Cadenas hermanas: " + buddyStrings(A,B));
		}
		
		int n = 1000;
		int length = (int)(Math.log10(n));
		
		System.out.println("------" + length);
	}

	public static boolean buddyStrings(String A, String B) {

		List indices = new ArrayList<>();
		int nDistintos = 0;

		if (A.equals(B) && A.length() > 1) {
			return true;
		}
		
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) != B.charAt(i)) {
				nDistintos++;
				indices.add(i);
			}
			if (nDistintos > 2) {
				System.out.println(nDistintos);
				return false;
			}
		}

		if (indices.size() < 2) {

			return false;
		}

		if (indices.size() == 2) {
			if ((A.charAt((int)indices.get(0)) != B.charAt((int)indices.get(1)))
					|| (B.charAt((int)indices.get(0)) != A.charAt((int)indices.get(1)))) {

				return false;
			}
		}

		return true;

	}

}
