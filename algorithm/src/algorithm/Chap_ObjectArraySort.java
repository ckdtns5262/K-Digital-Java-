package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Fruit implements Comparable<Fruit> {
	private String name;
	private int price;

	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "<" + name + ", " + price + ">";
	}

	@Override
	public int compareTo(Fruit c) {
//		if (this.price > c.price)  // fruit의 price가 크면 양수
//			return 1;
//		else if (this.price < c.price)
//			return -1;
//		else if (this.name.compareTo(c.name) > 0)
//			return 1; // this.name이 크면 양수
//		else if (this.name.compareTo(c.name) < 0)
//			return -1; // this.name이 작으면 음수
//		else {
//			return 0; // this.name이 같으면 0
//		}
		if (this.name.compareTo(c.name) > 0)
			return 1; // this.name을 먼저 비교하고 크면 양수
		else if (this.name.compareTo(c.name) < 0)
			return -1; // this.name이 작으면 음수
		else if (this.price > c.price) // fruit의 price가 크면 양수
			return 1;  //  this.price 가 크면 양수
		else if (this.price < c.price)
			return -1; // this.price 가 작으면 음수
		else return 0; 	// this.name이 같으면 0
	}
}

public class Chap_ObjectArraySort {
	public static void main(String[] args) {
		Fruit[] arr = { new Fruit("사과", 200), new Fruit("키위", 500), new Fruit("오렌지", 200), new Fruit("바나나", 50),
				new Fruit("수박", 880), new Fruit("체리", 10) };

		System.out.println();
		System.out.println("정렬전::");
		for (Fruit city : arr)
			System.out.print(" " + city);
		Arrays.sort(arr);

		// 구현 - 정렬
		System.out.println();
		System.out.println("정렬후::");
		for (Fruit city : arr)
			System.out.print(" " + city);

		ArrayList<Fruit> lst1 = new ArrayList<Fruit>(Arrays.asList(arr));
		ArrayList<Fruit> lst2 = new ArrayList<Fruit>();

		lst2.add(new Fruit("복숭아", 200));
		lst2.add(new Fruit("포도", 300));
		lst2.add(new Fruit("참외", 100));
		lst2.add(new Fruit("딸기", 50));
		lst2.add(new Fruit("블루베리", 500));
		lst2.add(new Fruit("구지뽕", 300));
		System.out.println();
		System.out.println("새로운 리스트1::");
		for (Fruit city : lst2)
			System.out.print(" " + city);
		// Arrays.sort(lst2);
		Collections.sort(lst2);
		
		System.out.println();
		System.out.println("새로운 리스트2::");
		for (Fruit city : lst2)
			System.out.print(" " + city);

		ArrayList<Fruit> lst3 = new ArrayList<Fruit>();
		
		Iterator<Fruit> iter1 = lst1.iterator();
		Iterator<Fruit> iter2 = lst2.iterator();

		// 구현- merge를 iterator 사용
		
		Fruit p1 = (Fruit)iter1.next();
		Fruit p2 = (Fruit)iter2.next();
		
		while(iter1.hasNext() && iter2.hasNext()) {
			if(p1.compareTo(p2)> 0) {
				lst3.add(p2);
				p2 = iter2.next();
			if(iter2.hasNext()==false) {
				lst3.add(p2);
				}
			} 
			else if(p1.compareTo(p2) < 0) {
				lst3.add(p1);
				p1 = iter1.next();
			if(iter1.hasNext()==false) {
				lst3.add(p1);
				}
			}	
		}
		
		
		
	
		
		
		
		System.out.println();
		System.out.println("merge:: ");
		for (Fruit city : lst3)
			System.out.print(city + " ");
		Fruit newFruit = new Fruit("참외", 100);
		// binary search - Comparator를 사용한 구현

		Comparator<Fruit> cc = new Comparator<Fruit>() {
			public int compare(Fruit u1, Fruit u2) {
				if (u1.getPrice() > u2.getPrice()) {
					return 1;
				} else if (u1.getPrice() == u2.getPrice()) {
					return 0;
				} else {
					return -1;
				}

			}
		};

		System.out.println();
		if (Collections.binarySearch(lst3, newFruit, cc) < 0)
			System.out.println("조회결과 없다");
		else
			System.out.println("조회 결과 " + newFruit);

	}
}
