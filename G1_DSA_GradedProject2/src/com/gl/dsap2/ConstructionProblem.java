package com.gl.dsap2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class ConstructionProblem {

	static Deque<Integer> dailyFloors = new ArrayDeque<Integer>();
	static Queue<Integer> floorsAssembled = new ArrayDeque<>();
	static ArrayList<Integer> arr = new ArrayList<>();

	public static void insertDailyFloors(Integer x) {
		if (dailyFloors.isEmpty()) {
			dailyFloors.add(x);
		} else {
			dailyFloors.add(x);
		}
		System.out.println(dailyFloors.toString());
	}

	public static void search(int pendingfloors, int maxDays) {

		int i = 0;
		int loopLength = maxDays - pendingfloors;
		boolean status = false;
		while (i <= loopLength) {

		}
	}

	static void sort(ArrayList<Integer> a, int n) {
		for (int i = n; i >= 0; i--)
			for (int j = n; j > n - i; j--)
				if (a.get(j) > a.get(j - 1)) {
					int tempswap = a.get(j);
					a.remove(j);
					a.add(j, a.get(j - 1));
					a.remove(j - 1);
					a.add(j - 1, tempswap);
				}

	}

	private static void searchOptimumFloor(int noOfItr, int noOfDays) {

		int searchFloor = noOfDays;
		for (int i = 0; i <= noOfItr; i++) {
			if (arr.get(i) != searchFloor) {
				break;
			} else {

				if (!floorsAssembled.contains(searchFloor)) {
					System.out.println("floor size to be shipped: " + searchFloor);
				}

				floorsAssembled.add(searchFloor);

			}
			searchFloor = searchFloor - 1;
		}
		System.out.println("out of loop");
	}

	public static void main(String[] args) {
		System.out.println("-----------no of days----------");
		Scanner sc = new Scanner(System.in);
		int noOfDays = sc.nextInt();
		for (int i = 0; i < noOfDays; i++) {
			int day = i + 1;
			System.out.println("day: " + day);
			int floorSize = sc.nextInt();
			arr.add(floorSize);
			sort(arr, i);
			System.out.println("--------- day:" + day);
			searchOptimumFloor(i, noOfDays);
		}

		sort(arr, noOfDays - 1);

	}

}
