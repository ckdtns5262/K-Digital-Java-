
package algorithm;

public class Chap5_Test_QueenEight_revised {

	static void SolveQueen(int[][] d) {
		int count = 0, mode = 0;
		int ix = 0, iy = 0;
		Stack2 st = new Stack2(30);
		Point p = new Point(ix, iy);
		d[ix][iy] = 1;
		count++;
		st.push(p);
		ix++;

		while (count < 8) {
			int cy = 0;
			ix++;

			while (ix < d.length) {
				cy = NextMove(d, ix, cy);
				System.out.println("NextMove: " + cy);

				if (cy < d.length) {
					Point px = new Point(ix, cy);
					st.push(px);
					System.out.println("push p: " + p);
					System.out.print("st: ");
					st.dump();
					d[ix][cy] = 1;
					count++;
					System.out.println("count: " + count);
					break;
				} else {
					p = st.pop();
					System.out.println("pop p: " + p);
					ix = p.getX();
					cy = p.getY();
					d[ix][cy] = 0;
					count--;
					System.out.println("count--: " + count);
					cy++;
					System.out.println("cy++: " + cy);
				}
//			System.out.println("nextMove()전::ix = " + ix + "cy = " + cy);
//			System.out.println("nextMove()후::ix = " + ix + "cy = " + cy);
			}
		}
	}

	static boolean checkRow(int[][] d, int crow) {// 행체크
		for (int i = 0; i < d.length; i++) {
			if (d[crow][i] == 1) {
				return false;
			}
		}
		return true;
	}

	static boolean checkCol(int[][] d, int ccol) {// 열체크
		for (int i = 0; i < d.length; i++) {
			if (d[i][ccol] == 1) {
				return false;
			}
		}
		return true;
	}

	static boolean checkDiagSW(int[][] d, int x, int y) { // x++, y-- or x--, y++ where 0<= x,y <= 7
		// 왼쪽대각 체크
		int cx = x, cy = y;
		while (cx > 0 && cy < d[0].length) {
			if (d[cx][cy] == 1) {
				return false;
			}
			cx--;
			cy++;
		}
		cx = x;
		cy = y;
		while (cx < d[0].length && cy > 0) {
			if (d[cx][cy] == 1) {
				return false;
			}
			cx++;
			cy--;
		}
		return true;
	}

	static boolean checkDiagSE(int[][] d, int x, int y) {// x++, y++ or x--, y--
		// 오른쪽대각 체크
		int cx = x, cy = y;
		while (cx > 0 && cy > 0 && cx < d[0].length && cy < d[0].length) {
			if (d[cx][cy] == 1) {
				return false;
			}
			cx++;
			cy++;
		}
		cx = x;
		cy = y;
		while (cx < d[0].length && cy < d[0].length && cx >= 0 && cy >= 0) {
			if (d[cx][cy] == 1) {
				return false;
			}
			cx--;
			cy--;
		}
		return true;
	}

	static boolean CheckMove(int[][] d, int x, int y) {// (x,y)로 이동 가능한지를 check

		if (checkRow(d, y) && checkCol(d, y) && checkDiagSE(d, x, y) && checkDiagSW(d, x, y)) { // 모든 방향에서 맞는지 확인(
			return true;
		}
		return false;
	}

	public static int NextMove(int[][] d, int row, int col) {// 다음 row에 대하여 이동할 col을 조사
		int nextCol = col + 1; // nextCol = col + 1 인 이유는 처음 col은 검사를 했기 때문에 col + 1
		while (nextCol < d.length) {
			if (CheckMove(d, row, nextCol)) { // CheckMove면 다음 nextCol , else면 nextCol++
				System.out.println("nextMove()중::ix = " + row + "cy = " + nextCol);
				return nextCol;
			}
			nextCol++;
		}
		return d.length;

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
