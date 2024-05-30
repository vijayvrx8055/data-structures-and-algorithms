package com.vrx.ds.searching.binary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearchRecursive {

	public static int binarySearchRecursive(int[] arr, int num, int low, int high) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == num) {
				return mid;
			} else if (arr[mid] > num) {
				return binarySearchRecursive(arr, num, low, mid - 1);
			} else if (arr[mid] < num) {
				return binarySearchRecursive(arr, num, mid + 1, high);
			}
		}
		return -1;

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number:");
		int num = Integer.parseInt(reader.readLine());
		System.out.println(binarySearchRecursive(arr, num, 0, arr.length - 1));
	}
}
