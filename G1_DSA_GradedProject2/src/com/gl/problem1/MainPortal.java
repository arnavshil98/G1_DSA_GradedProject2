package com.gl.problem1;

import java.util.Scanner;

public class MainPortal {
	static Scanner sc = new Scanner(System.in);
	static int arr[];

	public static void main(String[] args) {

		FactoryManagement facMag = new FactoryManagement();
		InventoryManagement invMag = new InventoryManagement();
		System.out.println("Enter the total number floors in the building : ");

		facMag.floors = sc.nextInt();
		arr = new int[facMag.floors + 1];
		facMag.sc = sc;
		facMag.addFloors(arr);
		
		System.out.println("The order of construction is as follows ");
		invMag.j = facMag.floors;
		invMag.manageFloors(arr, facMag.floors);
	}

}
