package com.vrx.ds.searching.binary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BinarySearch {
	/*
	 * - Used to find element in a sorted array 1. First find out the mid point 2.
	 * Compare that indexed value with given number a. arr[mid]==x // return mid b.
	 * arr[mid] > x // change high to mid-1 c. arr[mid] < x // change low to mid+1
	 * 
	 * 
	 */

	// Return index of number if found else return -1
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number:");
		int num = Integer.parseInt(reader.readLine());
		System.out.println(bSearch(arr, num));
	}

	public static int bSearch(int[] arr, int x) {
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == x) {
				return mid;
			} else if (arr[mid] > x) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
}
