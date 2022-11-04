package algorithm;

import java.util.Stack;

class items {
	int x;
	int y;
	int dir;
	// 생성자 생성하여 x, y, dir 초기값을 줌
	public items() {
		x = 0;
		y = 0;
		dir = 0;
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return x + "," + y + "," + dir;
	}
}

class Offsets {
	public int a;
	public int b;

	public Offsets() {
	}

	public Offsets(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

public class Chap5_MazingProblemCPP {

// n은 0으로 처리하겠다는 의미 enum;

	static Offsets moves[] = new Offsets[8]; // enum =[0,1,2,3,4,5,6,7]

	static int[][] maze = new int[100][100];
	static int[][] mark = new int[100][100];

	static void path(int[][] maze, int[][] mark,int m, int p) // 현재좌표 (m,p), maze,mark 배열 선언

//Output a path (if any) in the maze; rows is m, cols is p;
	{
		mark[1][1] = 1; // 시작점

		Stack<items> stack = new Stack<items>();
		items temp = new items(); // temp null값 오류 new items 참조연산자 사용해서 선언
		temp.x = 1;
		temp.y = 1;
		temp.dir = 2; // 시작점이 (1,1)에서 부터 동쪽으로 진행
		stack.push(temp);
		

		while (!stack.isEmpty()) // stack not empty   *stack이 비어있지 않을때 동안 
		{
			temp = stack.pop();  
			int i = temp.x;    
			int j = temp.y;
			int d = temp.dir;
			while (d < 8) // moves forward 방향을 뜻함 : d 8가지 방향 탐색
			{
				//System.out.println(i + "," + j + "," + d);
				int g = i + moves[d].a;    //
				int h = j + moves[d].b;	   //
				if ((g == m) && (h == p)) { // reached exit  
				  						// output path
					return;
				}
				if ((maze[g][h] == 0 ) && (mark[g][h]) == 0 ) {// 미로가 0이거나 이동한좌표가 0이면
					mark[g][h] = 1; // mark에 1을 표시
					
					items temp2 = new items();
					
					temp2.x = i;
					temp2.y = j;
					temp2.dir = d + 1;
					stack.push(temp2); // stack it
					i = g;
					j = h;
					d = 0; // moves to (g,h)
				} else
					d++; // try next direction 방향
			}
		}

	}

	public static void main(String[] args) {

		int input[][] = { // 12 x 15
				{ 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1 },
				{ 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0 },
				{ 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
				{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 }, { 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1 }, { 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 }, { 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 }, };
		
		for (int ia = 0; ia < 8; ia++)
		moves[ia] = new Offsets(0, 0);
		moves[0].a = -1;
		moves[0].b = 0;
		moves[1].a = -1;
		moves[1].b = 1;
		moves[2].a = 0;
		moves[2].b = 1;
		moves[3].a = 1;
		moves[3].b = 1;
		moves[4].a = 1;
		moves[4].b = 0;
		moves[5].a = 1;
		moves[5].b = -1;
		moves[6].a = 0;
		moves[6].b = -1;
		moves[7].a = -1;
		moves[7].b = -1;

		for (int i = 0; i < 14; i++) {
			for (int j = 0; j < 17; j++) {
				if ((i == 0) || (j == 0) || (i == 13) || (j == 16))
					maze[i][j] = 1;
				else {
					maze[i][j] = input[i - 1][j - 1];
				}
				mark[i][j] = 0;

			}
		}
		System.out.println("maze[12,15]::");
		for (int i = 0; i <= 13; i++) {
			for (int j = 0; j <= 16; j++) {
				System.out.print(maze[i][j] + " ");

			}
			System.out.println();
		}
//		System.out.println("mark::");
//		for (int i = 0; i <= 13; i++) {
//			for (int j = 0; j <= 16; j++) {
//				System.out.print(mark[i][j] + " ");
//
//			}
//			System.out.println();
//		}
		path(maze, mark, 12, 15);
		System.out.println("mark::");
		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <= 15; j++) {
				System.out.print(mark[i][j] + " ");
				
			}
			System.out.println();
			
		}

	}


}
