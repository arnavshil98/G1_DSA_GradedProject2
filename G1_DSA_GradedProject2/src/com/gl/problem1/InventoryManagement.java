package com.gl.problem1;

public class InventoryManagement {
	int j;
	boolean flag;
	
	public void manageFloors(int [] arr, int floors) {
	for (int i = 1; i <= floors; i++) {
		flag = false;
		System.out.println("Day " + i + " :");
		while (j >= 1 && arr[j] <= i) {
			flag = true;
			System.out.print(j + " ");
			j--;
		}
		if (flag == true) {
			System.out.println();
		}
	}
	}
}
