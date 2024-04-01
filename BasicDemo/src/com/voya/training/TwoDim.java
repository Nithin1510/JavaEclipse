package com.voya.training;

public class TwoDim {
	public static void main(String[] args) {
		int [][]array = new int[3][2];
		array[0][0] = 10;
		array[0][1] = 20;
		array[1][0] = 30;
		array[1][1] = 40;
		array[2][0] = 50;
		array[2][1] = 60;
		
//		for (int i=0;i<array.length;i++) {
//			for (int j=0;j<array[i].length;j++) {
//				System.out.println(array[i][j]);
//			}
//		}
		
		for (int[] row:array) {
			for(int col: row) {
				System.out.println(col);
			}
		}
	}
}
