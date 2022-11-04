//package Chap5_DS;
//
//import java.util.Stack;
//
//import algorithm.Stack2.EmptyIntStackException;
//import algorithm.Stack2.OverflowIntStackException;
//
//class Point {
//	private int ix;
//	private int iy;
//
//	public Point(int x, int y) {
//		ix = x;
//		iy = y;
//	}
//
//	public String toString() {
//		return "<" + ix + ", " + iy + ">";
//	}
//
//	public int getX() {
//		return ix;
//	}
//
//	public int getY() {
//		return iy;
//	}
//
//	public void setX(int x) {
//		ix = x;
//	}
//
//	public void setY(int y) {
//		iy = y;
//	}
//}
//
//class Stack2 {
//	private Point[] stk; // 스택용 배열
//	private int capacity; // 스택의 크기
//	private int ptr; // 스택 포인터
//
//	// --- 실행시 예외 : 스택이 비어있음 ---//
//	public class EmptyIntStackException extends RuntimeException {
//		/**
//		 * 
//		 */
//		private static final long serialVersionUID = -8751506886097444394L;
//
//		public EmptyIntStackException() {
//		}
//	}
//
//	// --- 실행시 예외 : 스택이 가득 참 ---//
//	public class OverflowIntStackException extends RuntimeException {
//		/**
//		 * 
//		 */
//		private static final long serialVersionUID = 5606020980863688443L;
//
//		public OverflowIntStackException() {
//		}
//	}
//
//	// --- 생성자(constructor) ---//
//	public Stack2(int maxlen) {
//		// TODO Auto-generated constructor stub
//		ptr = 0;
//		capacity = maxlen;
//		try {
//			stk = new Point[capacity]; // 스택 본체용 배열을 생성
//		} catch (OutOfMemoryError e) { // 생성할 수 없음
//			capacity = 0;
//		}
//	}
//
//	// --- 스택에 x를 푸시 ---//
//	public Point push(Point p) throws OverflowIntStackException {
//		if (ptr >= capacity) // 스택이 가득 참
//			throw new OverflowIntStackException();
//		return stk[ptr++] = p;
//	}
//
//	// --- 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄) ---//
//	public Point pop() throws EmptyIntStackException {
//		if (ptr <= 0) // 스택이 빔
//			throw new EmptyIntStackException();
//		return stk[--ptr];
//	}
//
//	// --- 스택에서 데이터를 피크(peek, 정상에 있는 데이터를 들여다봄) ---//
//	public Point peek() throws EmptyIntStackException {
//		if (ptr <= 0) // 스택이 빔
//			throw new EmptyIntStackException();
//		return stk[ptr - 1];
//	}
//
//	// --- 스택을 비움 ---//
//	public void clear() {
//		ptr = 0;
//	}
//
//	// --- 스택에서 x를 찾아 인덱스(벌견하지 못하면 –1)를 반환 ---//
//	public int indexOf(Point x) {
//		for (int i = ptr - 1; i >= 0; i--) // 정상 쪽에서 선형검색
//			if (stk[i].equals(x))
//				return i; // 검색 성공
//		return -1; // 검색 실패
//	}
//
//	// --- 스택의 크기를 반환 ---//
//	public int getCapacity() {
//		return capacity;
//	}
//
//	// --- 스택에 쌓여있는 데이터 갯수를 반환 ---//
//	public int size() {
//		return ptr;
//	}
//
//	// --- 스택이 비어있는가? ---//
//	public boolean isEmpty() {
//		return ptr <= 0;
//	}
//
//	// --- 스택이 가득 찼는가? ---//
//	public boolean isFull() {
//		return ptr >= capacity;
//	}
//
//	// --- 스택 안의 모든 데이터를 바닥 → 정상 순서로 표시 ---//
//	public void dump() {
//		if (ptr <= 0)
//			System.out.println("스택이 비어있습니다.");
//		else {
//			for (int i = 0; i < ptr; i++)
//				System.out.print(stk[i] + " ");
//			System.out.println();
//		}
//	}
//}
//
//public class Chap5_Test_QueenEight_revised {
//
//	static void SolveQueen(int[][] d) {
//		int count = 0, mode = 0;
//		int ix = 0, iy = 0;
//		Stack2 st = new Stack2(100);
//		Point p = new Point(ix, iy);
//		d[ix][iy] = 1;
//		count++;
//		st.push(p);
//
//		while (count < 8) {
//			ix++; int cy = 0;
//			while (ix < d.length) {
//				cy = NextMove(d, ix, cy);
//			
//				while (cy < d[0].length) {
//					Point px = new Point(ix, cy);
//					st.push(px);
//					count++;
//					System.out.print("push()::ix = "+ ix + "iy = "+ iy);
//					break;
//				}
//				if (cy == d.length){
//					System.out.print("pop():::ix = "+ ix + "iy = "+ iy);
//					p = st.pop();
//					count--;
//					ix = p.getX();
//					cy = p.getY();
//					d[ix][cy] = 0;
//				}
//				else break;
//			}
//		}
//
//	}
//
//	static boolean checkRow(int[][] d, int crow) {// 행체크
//		for (int i = 0; i < crow; i++) {
//			if (d[crow][i] == 1) {
//				return true;
//			}
//		}
//		return false;
//	}
//
//	static boolean checkCol(int[][] d, int ccol) {// 열체크
//		for (int i = 0; i < ccol; i++) {
//			if (d[i][ccol] == 1) {
//				return true;
//			}
//		}
//		return false;
//	}
//
//	static boolean checkDiagSW(int[][] d, int cx, int cy) { // x++, y-- or x--, y++ where 0<= x,y <= 7
//		// 왼쪽대각 체크
//		while (cx < d.length - 1 && cy > 0) {
//			cx++;
//			cy--;
//			if (d[cx][cy] == 1)
//				return true;
//
//		}
//		while (cx > 0 && cy < d[0].length - 1) {
//			cx--;
//			cy++;
//			if (d[cx][cy] == 1)
//				return true;
//
//		}
//		return true;
//	}
//
//	static boolean checkDiagSE(int[][] d, int cx, int cy) {// x++, y++ or x--, y--
//		// 오른쪽대각 체크
//		while (cx < d.length - 1 && cy < d[0].length - 1) {
//			cx++;
//			cy++;
//			if (d[cx][cy] == 1)
//				return true;
//
//		}
//		while (cx > 0 && cy > 0) {
//			cx--;
//			cy--;
//			if (d[cx][cy] == 1)
//				return true;
//
//		}
//		return true;
//	}
//
//	static boolean CheckMove(int[][] d, int x, int y) {// (x,y)로 이동 가능한지를 check
//
//		if (checkRow(d, y) && checkCol(d, y) && checkDiagSE(d, x, y) && checkDiagSW(d, x, y)) { // 모든 방향에서 맞는지 확인(
//			return true;
//		}
//		return false;
//	}
//
////	static int NextMove(int[][] d, int row, int col) {// 다음 row에 대하여 이동할 col을 조사
////		if (col != d[0].length - 1)
////			return true;
////		return false;
////
////	}
//	public static int NextMove(int[][] d, int row, int col) {// 다음 row에 대하여 이동할 col을 조사
//		int nextCol = col; // nextCol = col + 1 인 이유는 처음 col은 검사를 했기 때문에 col + 1
//		while (nextCol < d.length) {
//			if (CheckMove(d, row, nextCol)) { // CheckMove면 다음 nextCol , else면 nextCol++
//				return nextCol;
//			}
//			nextCol++;
//		}
//		return d.length;
//
//	}
//
//	public static void main(String[] args) {
//		int row = 8, col = 8;
//		int[][] data = new int[8][8];
//		for (int i = 0; i < data.length; i++)
//			for (int j = 0; j < data[0].length; j++)
//				data[i][j] = 0;
//
//		SolveQueen(data);
//
//		for (int i = 0; i < data.length; i++) {
//			for (int j = 0; j < data[0].length; j++) {
//				System.out.print(" " + data[i][j]);
//			}
//			System.out.println();
//		}
//	}
//}
