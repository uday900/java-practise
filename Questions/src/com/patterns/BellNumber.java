package com.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Problem Statement
You are given a range [lower, upper], and you need to generate a specific number pattern based on the following rules:
The first row starts with [1].
Each subsequent row follows these rules:
The first and last elements of the new row are taken from the previous row (unchanged).
Each inner element is the sum of two adjacent elements from the previous row.
The sequence continues until the last element of a row exceeds upper.
You need to calculate the sum of all odd numbers within the range [lower, upper] from the generated rows.

Example Walkthrough
Input:
lower = 10
upper = 888

Generated Rows:
Row 1:  [1]
Row 2:  [1, 2]
Row 3:  [2, 3, 5]
Row 4:  [5, 7, 10, 15]
Row 5:  [15, 20, 27, 37, 52]
Row 6:  [52, 67, 87, 114, 151, 203]
Row 7:  [203, 255, 322, 409, 523, 674, 877]

Valid Odd Numbers in Range [10, 888]:
15, 27, 37, 67, 87, 151, 203, 255, 409, 523, 877

Output:
Sum = 15 + 27 + 37 + 67 + 87 + 151 + 203 + 255 + 409 + 523 + 877 = 2651

 */
public class BellNumber {
	public static void main(String[] args) {
		printBellNumberSequence(10, 888);
	}

	public static void printBellNumberSequence(int start, int end) {
		List<Integer> old = new ArrayList<>(Arrays.asList(1));
		List<Integer> neww = new ArrayList<>(Arrays.asList(1));
		List<Integer> result = new ArrayList<>();
		while (true) {
			for (int i = 0; i < old.size(); i++) {
				neww.add(old.get(i) + neww.get(i));

				if (neww.getLast() % 2 != 0 && neww.getLast() > start && neww.getLast() < end) {
					result.add(neww.getLast());
				}
			}
			old = neww;
			neww = new ArrayList<>(Arrays.asList(old.getLast()));
			if (old.getLast() > end)
				break;
		}
		System.out.println(result.stream().mapToInt(Integer::intValue).sum());
	}
}
