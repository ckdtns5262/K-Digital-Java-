//package algorithm;
//
//import java.util.Stack;
//
//class items {
//	static int x;
//	static int y;
//	static int dir;
//
//	public String toString() {
//		return items.x + "," + items.y + "," + items.dir;
//	}
//}
//class Offsets {
//	public int a;
//	public int b;
//	public Offsets(){}
//	public Offsets(int i, int j) {		
//	}
//}
//
//public class Chap5_MazingProblemCPP2 {
//
//// n은 0으로 처리하겠다는 의미 enum;
//
//static Offsets moves[] = new Offsets[8];
//
//	int maze[][];
//	int mark[][];
//
//void path(int m, int p)  // 현재좌표 (m,p)
//
////Output a path (if any) in the maze; rows is m, cols is p;
//{
//	//start at (1,1) 시작점
//	mark[1][1] = 1;
//
//	Stack<items> stack(m * p);
//	items temp;
//	temp.x = 1; temp.y = 1; temp.dir = 1; //시작점이 (1,1)에서 부터 동쪽으로 진행
//	stack.push(temp);
//
//	while (!stack.isEmpty()) // stack not empty
//	{
//		temp = stack.pop(); // unstack
//		int i = temp.x; int j = temp.y; int d = temp.dir;
//		while (d < 8) // moves forward  방향을 뜻함 : d 8가지 방향 탐색
//		{
//			//outFile << i << " " << j << " " << d << endl;
//			int g = i + moves[d].a;
//			int h = j + moves[d].b;
//			if ((g == m) && (h == p)) { // reached exit
//										// output path
////				cout << stack;
////
////				cout << "the term near the exit: " << i << " " << j << endl;
////				cout << "exit: " << m << " " << p << endl;
//				return;
//			}
//			if ((!maze[g][h]) && (!mark[g][h])) { // new position
//				mark[g][h] = 1;
//				
//				temp.x = i;  temp.y = j; temp.dir = d + 1;
//				stack.push(temp); // stack it
//				i = g; j = h; d = N; // moves to (g,h)
//			}
//			else d++; // try next direction 방향
//		}
//	}
//	
//}
//
////maze[][], mark[][]를 class의 private data member로 선언
////main()에서는 class의 public function의 호출로 미로 찾기
//
//	public static void main(String[] args) {
//		int[][] maze = new int[100][100];
//		int[][] mark = new int[100][100];
//
//		int input[][] = { // 12 x 15
//				{ 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1 },
//				{ 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0 },
//				{ 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
//				{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 }, { 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
//				{ 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1 }, { 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0 },
//				{ 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 }, { 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 }, };
//		for (int ia = 0; ia < 8; ia++)
//			moves[ia] = new Offsets(0, 0);
//		moves[0].a = -1;
//		moves[0].b = 0;
//		moves[1].a = -1;
//		moves[1].b = 1;
//		moves[2].a = 0;
//		moves[2].b = 1;
//		moves[3].a = 1;
//		moves[3].b = 1;
//		moves[4].a = 1;
//		moves[4].b = 0;
//		moves[5].a = 1;
//		moves[5].b = -1;
//		moves[6].a = 0;
//		moves[6].b = -1;
//		moves[7].a = -1;
//		moves[7].b = -1;
//
//		for (int i = 0; i < 14; i++) {
//			for (int j = 0; j < 17; j++) {
//				if ((i == 0) || (j == 0) || (i == 13) || (j == 16))
//					maze[i][j] = 1;
//				else {
//					maze[i][j] = input[i - 1][j - 1];
//				}
//				mark[i][j] = 0;
//
//			}
//		}
//		System.out.println("maze[12,15]::");
//		for (int i = 0; i <= 13; i++) {
//			for (int j = 0; j <= 16; j++) {
//				System.out.print(maze[i][j] + " ");
//
//			}
//			System.out.println();
//		}
//		System.out.println("mark::");
//		for (int i = 0; i <= 13; i++) {
//			for (int j = 0; j <= 16; j++) {
//				System.out.print(mark[i][j] + " ");
//
//			}
//			System.out.println();
//		}
//		path(maze, mark, 12, 15);
//		System.out.println("mark::");
//		for (int i = 1; i <= 12; i++) {
//			for (int j = 1; j <= 15; j++) {
//				System.out.print(mark[i][j] + " ");
//
//			}
//			System.out.println();
//		}
//
//	}
//
//}
