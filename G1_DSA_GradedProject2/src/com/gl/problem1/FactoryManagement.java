package com.gl.problem1;

import java.util.Scanner;

public class FactoryManagement {
	Scanner sc;
	int floors;

	public void addFloors(int[] arr) {
		for (int i = 1; i < floors + 1; i++) {
			System.out.println("Enter the floor size given on day : " + i);
			int size = sc.nextInt();
			arr[size] = i;
		}
	}
}
