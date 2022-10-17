package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Chap1_MergeList {
	public static String[] removeElement(String[] arr, String item) {
		List<String> list = new ArrayList<>(Arrays.asList(arr)); // 배열을 list로 만듬
		list.remove(item);
		return list.toArray(String[]::new);
	}

	public static String[] removeDuplicate(String[] lst) {
		int count = lst.length;
		for (int i = 0; i < count; i++) {
			int j = i + 1;
			while (j < count) {
				if ((lst[i].compareTo(lst[j])) == 0) {
					lst = removeElement(lst, lst[j]);
					count--;
					System.out.println("j =" + j + "count =" + count);
				} else
					j++;
			}
		}
		return lst;
	}

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>(); /// 배열을 list로
		list1.add("서울");
		list1.add("북경");
		list1.add("상해");
		list1.add("서울");
		list1.add("도쿄");
		list1.add("서울");
		list1.add("뉴욕");
		list1.add("홍도");
		ArrayList<String> list2 = new ArrayList<String>(); // 배열을 list로
		list2.add("런던");
		list2.add("로마");
		list2.add("방콕");
		list2.add("북경");
		list2.add("도쿄");
		list2.add("서울");
		list2.add("전라도");
		list2.add("제주");
		list2.add(1, "LA");
		list2.add("한라산");
		list2.add("하동");
		list2.add("하동");
		
		System.out.println("collection.sort()::");
		Collections.sort(list1);
		System.out.println("list1::");
		for (String city : list1)
			System.out.print(city + " ");

		Collections.sort(list2);
		System.out.println();
		System.out.println("list2 :");
		for (String city : list2)
			System.out.print(city + " ");

		String[] lst1 = new String[0];
		lst1 = list1.toArray(lst1);
		String[] lst2 = new String[0];
		lst2 = list2.toArray(lst2);

		lst1 = removeDuplicate(lst1);
		lst2 = removeDuplicate(lst2);

		Collections.sort(list2);
		System.out.println();
		System.out.println("lst1 :");
		for (String city : lst1)
			System.out.print(city + " ");

		for (String city : lst2)
			System.out.print(city + " ");

		String[] lst3 = new String[lst1.length + lst2.length];

		int i = 0, j = 0, k = 0;
		while (i < lst1.length && j < lst2.length) {
			if ((lst1[i].compareTo(lst2[j]) < 0)) { // lst1[i]이 작으면 lst3[k] 되고
				lst3[k] = lst1[i];
				i++;
				k++;
			} else if ((lst1[i].compareTo(lst2[j]) > 0)) { // lst2[j]가 작으면 lst3[k] 되고
				lst3[k] = lst2[j];
				j++;
				k++;
			} else { // lst1[i]= lst2[j]가 같으면 둘다 lst3[k]가 됨
				lst3[k] = lst1[i];
				i++;
				k++;
				j++;
			}
		}
		while (i < lst1.length) {
			lst3[k] = lst1[i];
			i++;
			k++;
		}

		while (j < lst2.length) {
			lst3[k] = lst2[j];
			j++;
			k++;
		}

		System.out.println();
		System.out.println("lst3 :");
		System.out.println(Arrays.toString(lst3));

//		 LinkedHashSet 사용
//		Set<String> set = new LinkedHashSet<>(list1);
//		set.addAll(list2);
//		List<String> mergeList = new ArrayList<>(set);
//		System.out.println("");
//		System.out.println("MergeList ::");
//		System.out.println(mergeList);

		ArrayList<String> list3 = new ArrayList<String>();

		Iterator<String> iter1 = list1.iterator();
		Iterator<String> iter2 = list2.iterator();

		String obj = (String) iter1.next();
		String obj2 = (String) iter2.next();

		while (iter1.hasNext() && iter2.hasNext()) {

			if (obj.compareTo(obj2) > 0) {
				list3.add(obj2);
				obj2 = iter2.next();
				if(iter2.hasNext() == false) {
					list3.add(obj2);
					
				}
			} else if (obj.compareTo(obj2) < 0) {
				list3.add(obj);
				obj = iter1.next();
				if(iter1.hasNext() == false) {
					list3.add(obj);
				}
					
			} else {
				list3.add(obj);
				obj = iter1.next();
				obj2 = iter2.next();
				if(iter2.hasNext() == false) {
					list3.add(obj2);
				}

			}
		}

		while(iter1.hasNext()) {
			list3.add(obj);
			obj = iter1.next();
		}

		while (iter2.hasNext()) {
			obj2 = iter2.next();
			list3.add(obj2);
		}
		//중복 제거
		int count = list3.size();
		for(int a=0; a < count; a++) {
			for(int b= a+1; b<count; b++) {
				if(list3.get(a).equals(list3.get(b))) {
					list3.remove(b);
					count --;
				}
			}
		}
		
		
		
		
		// 구현 부분

		System.out.println();
		System.out.println("merge:: ");
//		for (String city : list3)
//			System.out.print(city + " ");
		System.out.println(list3);

	}
}
