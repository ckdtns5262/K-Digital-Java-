package algorithm;

import java.util.Stack;

public class copy {

	public static void SolveQueen(int[][] d) {
		int count = 0; // 퀸의 수량
//		int mode = 0; //
		int ix = 0, iy = 0; // 초기 퀸의 위치좌표

		Stack<Point> st = new Stack<Point>();
		Point p = new Point(ix, iy);

		d[ix][iy] = 1; // 초기 좌표(0, 0), 1 = 퀸
		count++; // 퀸수 증가
		st.push(p); // 스택에 좌표 저장

		// 퀸 수가 8이하일때
		while (count < 8) {
			ix++; // 다음 행으로 이동
			int cy = 0; // 열 지정

			// 행의 수만큼 반복
			while (ix < d.length) {
				cy = NextMove(d, ix, cy);
				if (cy != d[0].length) {					
					Point px = new Point(ix, cy);
					st.push(px);
					count++;
					d[ix][cy] = 1;
					break;
				} else {
					// 팝으로 그이전으로 돌아감
					p = (Point) st.pop();
					// 그 이전단계의 x
					ix = p.getX();
					// 그 이전단계의 y
					cy = p.getY();	
					// 팝한 부분에 다시 0을 재배치(1로 체크했었던 것 제거)
					d[ix][cy] = 0;
					// 퀸수 감소
					count--;
					cy = p.getY()+1;
				}

			}

		}
	}

	// 퀸 존재여부 각 행마다 판별
	public static boolean checkRow(int[][] d, int crow) {
		for (int i = 0; i < d.length; i++) {
			if (d[crow][i] == 1)
				return false;
		}
		return true;
	}

	// 퀸 존재여부 각 열마다 판별
	public static boolean checkCol(int[][] d, int ccol) {
		for (int i = 0; i < d.length; i++) {
			if (d[i][ccol] == 1)
				return false;
		}
		return true;
	}

	public static boolean checkDiagSW(int[][] d, int cx, int cy) {
		// 처음 좌표 [0,0]을 기준으로 d[] 안에서 활동(전체 1사분면)
		// 대각선이 퀸이 이동할 공간을 중심으로 2가지의 경우의 수가 존재하므로 while문 2개
		int cxf = cx;
		int cyf = cy;
		while (0 <= cxf && cxf < d.length && 0 <= cyf && cyf < d[0].length) {
			if (d[cxf][cyf] == 1)
				return false;
			cxf--;
			cyf++;
		}
		while (0 <= cx && cx < d.length && 0 <= cy && cy < d[0].length) {
			if (d[cx][cy] == 1)
				return false;
			cx++;
			cy--;
		}
		return true;
	}

	public static boolean checkDiagSE(int[][] d, int cx, int cy) {
		int cxf = cx;
		int cyf = cy;
		while (0 <= cxf && cxf < d.length && 0 <= cyf && cyf < d[0].length) {
			if (d[cxf][cyf] == 1)
				return false;
			cxf++;
			cyf++;
		}
		while (0 <= cx && cx < d.length && 0 <= cy && cy < d[0].length) {
			if (d[cx][cy] == 1)
				return false;
			cx--;
			cy--;
		}

		return true;
	}

	public static boolean CheckMove(int[][] d, int x, int y) {// (x,y)로 이동 가능한지를 check
		if ((checkRow(d, x) && checkCol(d, y) && checkDiagSW(d, x, y) && checkDiagSE(d, x, y)) == true)
			return true;
		return false;
	}

	public static int NextMove(int[][] d, int row, int col) {
		// 다음 row에 대하여 이동할 col을 조사
		while (col < d[0].length) {
			if (CheckMove(d, row, col) == true)
				return col;
			col++;
		}
		return 8;
	}

	public static void main(String[] args) {
		int row = 8, col = 8;
		int[][] data = new int[8][8];
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[0].length; j++)
				data[i][j] = 0;

		SolveQueen(data);

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(" " + data[i][j]);
			}
			System.out.println();
		}
	}
}