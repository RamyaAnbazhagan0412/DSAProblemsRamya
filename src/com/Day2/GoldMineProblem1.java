package com.Day2;

import java.util.Scanner;

public class GoldMineProblem1 {

		public static int collectGold(int[][] mat, int x, int y, int n, int m) {
			if ((x < 0) || (x == n) || (y == m)) {

				return 0;
			}
			int ru = collectGold(mat, x - 1, y + 1, n, m);
			int r = collectGold(mat, x, y + 1, n, m);
			int rl = collectGold(mat, x + 1, y + 1, n, m);

			return mat[x][y] + Math.max(Math.max(ru, rl), r);
		}

		public static int maxGold(int[][] mat, int n, int m) {
			int maxGold = 0;
			for (int i = 0; i < n; i++) {
				int goldCollected = collectGold(mat, i, 0, n, m);
				maxGold = Math.max(maxGold, goldCollected);
			}
			return maxGold;
		}

		public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] arr=new int[n][m];
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			
			
			System.out.println(maxGold(arr, n, m));

		}

	}
