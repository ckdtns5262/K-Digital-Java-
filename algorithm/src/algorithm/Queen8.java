package algorithm;

import java.util.Arrays;

public class Queen8 {

		private static boolean isSafe(char[][] mat, int r, int c) { // 서로 위협하는지 확인하는 함수
			// 두개의 퀸이 동일한 열을 공유하면 false를 반환
			for (int i = 0; i < r; i++) {
				if (mat[i][c] == 'Q') {
					return false;
				}
			}
			// 두개의 퀸이 동일한 대각선(``)을 공유하는 경우 false 반환
			for (int i = r, j = c; i >= 0 && j >= 0; i--, j--) {
				if (mat[i][j] == 'Q')
					return false;
			}
			// 두개의 퀸이 동일한 대각선(/)을 공유하는 경우 false 반환
			for (int i = r, j = c; i >= 0 && j < mat.length; i--, j++) {
				if (mat[i][j] == 'Q')
					return false;
			}
			return true;
		}

		private static void printSolution(char[][] mat) {
			for (char[] chars : mat) {
				System.out.println(Arrays.toString(chars).replaceAll(",", ""));
			}
			System.out.println();
		}

		private static void nQueen(char[][] mat, int r) {
			// n 퀸이 성공적으로 배치되면 솔루션 인쇄
			if (r == mat.length) {
				printSolution(mat);
				return;
			}
			// 현재 행 r 의 모든 사각형에 퀸을 배치
			// 유효한 각 움직임에 대해 반복
			for (int i = 0; i < mat.length; i++)
				if (isSafe(mat, r, i)) { // 퀸이 서로 위협하지않는 경우
					mat[r][i] = 'Q'; // 현재 사각형에 퀸 배치
					nQueen(mat, r + 1); // 다음 행에 대해 반복
					mat[r][i] = '-'; // 현재 사각형에서 퀸 역추적하고 제거
				}

		}
	

	public static void main(String[] args) {
		int N = 8;
		
		char[][] mat = new char[N][N];
		
		for(int i=0; i < N; i++) {
			Arrays.fill(mat[i], '-');
		}
		nQueen(mat, 0);
	
	}
}
