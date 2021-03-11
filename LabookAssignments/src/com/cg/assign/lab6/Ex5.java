package com.cg.assign.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex5 {
	public int getSecondSmallest(int[] arr) {
		List<Integer> List = new ArrayList<Integer>();
		for (int i : arr) {
			List.add(i);
		}
		Collections.sort(List);
		return List.get(1);
	}

	public static void main(String[] args) {
		Ex5 p = new Ex5();
		int arr[] = { 41, 62, 33, 82, 39, 67, 78, 34, 56, 3, 36, 45, 72 };
		int i = p.getSecondSmallest(arr);
		System.out.println(i);
	}
}
