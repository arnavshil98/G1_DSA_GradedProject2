package com.gl.problem1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class ConstructionProblem {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number floors in the building : ");
		int floors = sc.nextInt();
		int arr[] = new int[floors + 1];
		for (int i = 1; i < floors + 1; i++) {
			System.out.println("Enter the floor size given on day : " + i);
			int size = sc.nextInt();
			arr[size]= i;
		}
		int j = floors;
		boolean flag;
		System.out.println("The order of construction is as follows ");
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
