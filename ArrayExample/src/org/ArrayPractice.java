package org;

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println("enter");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i<arr.length;i++) {
			int temp = sc.nextInt();
			arr[i] = temp * 2;
		}
		System.out.println("output");
		for(int temp:arr) {
			System.out.println(temp);
		}

	}

}
