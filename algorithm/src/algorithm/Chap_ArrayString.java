package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
//string 정렬, binary search 구현
//1단계: string, 2단계: string 객체,  Person 객체들의 list\

public class Chap_ArrayString {
	public static String[] removeElement1(String[] arr, String item) {
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		list.remove(item);
		return list.toArray(String[]::new);
	}

	public static void main(String[] args) {

//		String a = "Hello", b = "good";
//		String tep = a;
//		a= b; b= tep;
//		
//		System.out.println(a);
//		System.out.println(b);

		ArrayList<String> list = new ArrayList<String>();
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("서울");
		list.add("도쿄");
		list.add("뉴욕");
		list.add("런던");
		list.add("로마");
		list.add("방콕");
		list.add("북경");
		list.add("도쿄");
		list.add("서울");
		list.add(1, "LA");

		// sort - 오름차순으로 정렬, 내림차순으로 정렬, 중복 제거하는 코딩
		System.out.println("collection.sort()::");
	    Collections.sort(list);
		for (String city : list)
			System.out.println(city);

		String cities[] = new String[0]; //
		cities = list.toArray(cities); // list를 배열로
//	    Arrays.sort(cities);
		System.out.println(Arrays.toString(cities));
		List<String> list2 = Arrays.asList(cities);
		for(String str : list2) {
			System.out.println(str);
		}
		
		for (int i = 0; i < cities.length; i++) {
			for (int j = i + 1; j < cities.length; j++) {
				if (cities[i].compareTo(cities[j]) > 0) {
					String temp = cities[i];
					cities[i] = cities[j];
					cities[j] = temp;
				}
			}

		}
//	System.out.println("정렬: " + Arrays.toString(cities));
		
		
		
		ArrayList<String> lst = new ArrayList<String>(Arrays.asList(cities));

//	    System.out.println("정렬후::");
//	    for ( String city: cities)
//	    	System.out.println(city);
//	    //중복제거
		System.out.println("중복제거::");
		int count = lst.size();
		for (int m = 0; m < count; m++) {
			for (int n = m + 1; n < count; n++) {
			if (lst.get(n).equals(lst.get(m))) {
					lst.remove(n);
					count--;
				}
			}

		}
		// 중복 제거
		System.out.println(lst);

//
//	    ArrayList<String> lst = new ArrayList<String>(Arrays.asList(cities));
//	    for ( String city: lst)
//	    	System.out.println(city);

	}
}