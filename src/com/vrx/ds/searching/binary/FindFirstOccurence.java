package com.vrx.ds.searching.binary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindFirstOccurence {

	public static int findFirstOccurence(int[] arr, int num) {
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == num) {
				if (mid == 0 || arr[mid - 1] != arr[mid]) {
					return mid;
				} else {
					high = mid - 1;
				}
			} else if (arr[mid] > num) {
				high = mid - 1;
			} else if (arr[mid] < num) {
				low = mid + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] arr = { 5,5,10,10,15,20,20,20 };
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number:");
		int num = Integer.parseInt(reader.readLine());
		System.out.println(findFirstOccurence(arr, num));

	}
}
