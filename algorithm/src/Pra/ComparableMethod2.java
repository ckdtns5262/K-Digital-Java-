package Pra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Cars implements Comparable<Cars> {
	private String name;
	private int price;

	public Cars(String cn, int cp) {
		name = cn;
		price = cp;
	}

	@Override
	public String toString() {
		return "<" + name + ", " + price + ">";
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int CompareTo(Cars c1) {
		if (this.name.compareTo(c1.name) > 0)
			return 1;
		else if (this.name.compareTo(c1.name) < 0)
			return -1;
		else
			return 0;
	}

	@Override
	public int compareTo(Cars o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class ComparableMethod2 {
	public static void main(String[] args) {
		System.out.println("======스트링::");
		String[] c = { "아반떼", "소나타", "그랜져", "제네시스", "테슬라" };

		Arrays.sort(c); // 정렬
//	Arrays.sort(c, Comparator.reverseOrder()); 

		Arrays.sort(c, new Comparator<String>() {

			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});

		for (String city : c)
			System.out.print(" " + city);
		System.out.println();

		List<String> lst = Arrays.asList(c);
		for (String city : lst)
			System.out.print(" " + city);

		System.out.println();
		System.out.println("======객체::");

		Cars[] arr = { new Cars("아반떼", 10), new Cars("소나타", 30), new Cars("그랜져", 20), new Cars("제네시스", 60),
				new Cars("테슬라", 50) };

		Arrays.sort(arr, new Comparator<Cars>() {
			public int compare(Cars o1, Cars o2) {
				return o1.CompareTo(o2);
			}
		});

		for (Cars cx : arr)
			System.out.print("" + cx);

		System.out.println();
		System.out.println("=====람다식::");

		Arrays.sort(arr, (a, b) -> a.getPrice() - b.getPrice());
		for (Cars cx : arr)
			System.out.print("" + cx);

		ArrayList<Cars> lst1 = new ArrayList<Cars>(Arrays.asList(arr));
		ArrayList<Cars> lst2 = new ArrayList<Cars>();
		lst2.add(new Cars("투싼", 200));
		lst2.add(new Cars("벤츠", 500));
		lst2.add(new Cars("아우디", 100));
		lst2.add(new Cars("티볼리", 50));
		lst2.add(new Cars("코란도", 60));
		System.out.println();
		System.out.println("새로운 리스트2::");
		for (Cars cx : lst2)
			System.out.print("" + cx);

		ArrayList<Cars> lst3 = new ArrayList<Cars>();

		Iterator<Cars> iter1 = lst1.iterator();
		Iterator<Cars> iter2 = lst2.iterator();

		Cars p1 = (Cars) iter1.next();
		Cars p2 = (Cars) iter2.next();

		while (iter1.hasNext() && iter2.hasNext()) {
			if (p1.CompareTo(p2) > 0) {
				lst3.add(p2);
				p2 = iter2.next();
				if (iter2.hasNext() == false) {
					lst3.add(p2);

				}
			} else if (p1.CompareTo(p2) < 0) {
				lst3.add(p1);
				p1 = iter1.next();
				if (iter1.hasNext() == false) {
					lst3.add(p1);

				}
			} else {
				lst3.add(p1);
				p1 = iter1.next();
				p2 = iter2.next();
			}
		}
		while (iter1.hasNext()) {
			lst3.add(p1);
			p1 = iter1.next();
		}
		while (iter2.hasNext()) {
			lst3.add(p2);
			p2 = iter2.next();
		}

		System.out.println();
		System.out.println("merge:: ");
		for (Cars cx : lst3)
			System.out.print(cx + "");

	}

}
