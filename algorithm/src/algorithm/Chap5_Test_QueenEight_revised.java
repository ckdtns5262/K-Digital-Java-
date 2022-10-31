
package algorithm;

public class Chap5_Test_QueenEight_revised {

	public static void SolveQueen(int[][] d) {
		int count = 0, mode = 0;
		int ix = 0, iy = 0;
		Stack3 st = new Stack3(10);
		Point p = new Point(ix, iy);
		d[ix][iy] = 1;
		count++;
		st.push(p);

		while (count < 8) {
			ix++;
			int cy = 0;
			while (ix < d.length) {

				while (cy < d[0].length) {
					st.push(px);
					count++;
					break;

				}
				if (cy != d[0].length) {
					break;
				} else {
					p = st.pop();
					count--;

				}

			}

		}
	}

	public static boolean checkRow(int[][] d, int crow) {// 행체크
		for (int i = 0; i < crow; i++) {
			if (d[crow][i] == 1) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkCol(int[][] d, int ccol) {// 열체크
		for (int i = 0; i < ccol; i++) {
			if (d[i][ccol] == 1) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkDiagSW(int[][] d, int cx, int cy) { // x++, y-- or x--, y++ where 0<= x,y <= 7
		// 왼쪽대각 체크
		while (cx >= 0 && cx <= 7) {
			if(d[cx][cy] == 1) {
				cx ++;
				cy --;
				return false;
			} 
		}
		while(cy >= 0 && cy <= 7) {
			if(d[cx][cy] == 1) {
				cx --;
				cy ++;
				return false;
			}
		}
				return true;
	}

	public static boolean checkDiagSE(int[][] d, int cx, int cy) {// x++, y++ or x--, y--
		// 오른쪽대각 체크
		while(cx >= 0 && cx <= 7) {
			if(d[cx][cy] == 1) {
				cx ++;
				cy ++;
				return false;
			}
		}
		while(cy >=0 && cy <= 7) {
			if(d[cx][cy] == 1) {
				cx --;
				cy --;
				return false;
			}
		}
				return true;
	}

	public static boolean CheckMove(int[][] d, int x, int y) {// (x,y)로 이동 가능한지를 check

		if(checkRow(d, y) && checkCol(d, y) && checkDiagSE(d, x, y) && checkDiagSW(d, x, y)) { // 모든 방향에서 맞는지 확인(
			return true;
		} 	return false;
	}

	public static boolean NextMove(int[][] d, int row, int col) {// 다음 row에 대하여 이동할 col을 조사
		
		while(row >= 0 && row <= 7) {
			if(CheckMove(d, row, col)) {
				return true;
			}						
			return false;
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
