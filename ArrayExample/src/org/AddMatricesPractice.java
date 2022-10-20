package org;

import java.util.Scanner;

public class AddMatricesPractice {

	public static void main(String[] args) {
		int[][] nums1 = new int[3][3];
		System.out.println("enter values of first matrix");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				nums1[i][j] = sc.nextInt();
			}
		}
		
//		System.out.println("values are");
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.print(nums1[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		
		
		int[][] nums2 = new int[3][3];
		System.out.println("enter values of second matrix");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				nums2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("results are");
		int[][] res = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				res[i][j] = nums1[i][j] + nums2[i][j];
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}

	}

}
