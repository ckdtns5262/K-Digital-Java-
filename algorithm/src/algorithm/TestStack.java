package algorithm;

import java.util.Scanner;

class Point {
	private int ix;
	private int iy;

	public Point(int x, int y) {
		ix = x;
		iy = y;
	}

	public String toString() {
		return "<" + ix + ", " + iy + ">";
	}

	public int getX() {
		return ix;
	}

	public int getY() {
		return iy;
	}

	public void setX(int x) {
		ix = x;
	}

	public void setY(int y) {
		iy = y;
	}
}

public class TestStack {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Stack2 s = new Stack2(8); // 최대 64 개를 푸시할 수 있는 스택
		int rndx = 0; int rndy = 0;
		

		
		while (true) {
			System.out.println(); // 메뉴 구분을 위한 빈 행 추가
			System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1)푸시　(2)팝　(3)피크　(4)덤프　(0)종료: ");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;
			
			switch (menu) {
			case 1: // 푸시
				System.out.print("데이터: ");
				if (s.isFull())
					System.out.println("스택이 가득찼있습니다.");
				else {
				
					Point p = new Point(rndx, rndy);
					
					rndx= (int) (Math.random()*8);
					rndy =(int) (Math.random()*8); 
					p.setX(rndx); p.setY(rndy);
					if(s.indexOf(p)== -1) {
						s.push(p);	
					}
					else {
						p.setX(rndx); p.setY(rndy);
						s.push(p);
					}
				}
				
				break;

			case 2: // 팝
				if (s.isEmpty())
					System.out.println("스택이 비어있습니다.");
				else {
					Point p = new Point(rndx, rndy);
					p = s.pop();
					System.out.println("팝한 데이터는 " + p + "입니다.");
				}
				break;

			case 3: // 피크
				if (s.isEmpty())
					System.out.println("스택이 비어있습니다.");
				else {
					Point p = new Point(rndx, rndy);			
					p = s.peek();
					System.out.println("피크한 데이터는 " + p + "입니다.");
				}
				break;

			case 4: // 덤프
				
				s.dump();
					break;
				
			}
		}
	}
}