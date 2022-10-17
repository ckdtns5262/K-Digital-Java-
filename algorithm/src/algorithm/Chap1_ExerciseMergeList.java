package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

public class Chap1_ExerciseMergeList {
	public static void main(String[] args) {
				ArrayList<String> list1 = new ArrayList<String>();
				list1.add("서울");
				list1.add("북경");
				list1.add("상해");
				list1.add("서울");
				list1.add("도쿄");
				list1.add("서울");
				list1.add("뉴욕");
				
				ArrayList<String> list2 = new ArrayList<String>();
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
				
				//
				System.out.println("collection.sort()::");
			    Collections.sort(list1);
			    System.out.println("list1::");
			    for ( String city: list1)
			    	System.out.print(city+ " ");
			    
			    System.out.println();
			    System.out.println("list2::");
			    Collections.sort(list2);
			    for ( String city: list2)
			    	System.out.print(city+ " ");
			    
			  
			    
			    
				ArrayList<String> list3 = new ArrayList<String>();
				
				Iterator<String> iter1 = list1.iterator();
				Iterator<String> iter2 = list2.iterator();
			
				String p1 = (String)iter1.next();
				String p2 = (String)iter2.next();
				
				while(iter1.hasNext() && iter2.hasNext()) {
					
					if(p1.compareTo(p2) > 0) {
						list3.add(p2);
						p2 = iter2.next();
						if(iter2.hasNext() == false) {
							list3.add(p2);
						}
					} else if(p1.compareTo(p2) < 0) {
						list3.add(p1);
						p1 = iter1.next();
						if(iter1.hasNext() == false) {
							list3.add(p1);
						}
					} else {
						list3.add(p1);
						p1 = iter1.next();
						p2 = iter2.next();
						if(iter2.hasNext() == false) {
							list3.add(p2);
						}
					}
				}
				
				while(iter1.hasNext()) {
					list3.add(p1);
					p1 = iter1.next();
				}
				
				while(iter2.hasNext()) {
					p2 = iter2.next();
					list3.add(p2);
		
				}
				//중복제거 
//				int count = list3.size();
//				for(int x=0; x < count; x++) {
//					for(int y= x + 1; y < count; y++) {
//						if(list3.get(x).equals(list3.get(y))) {
//							list3.remove(y);
//							count --;
//						}
//					}
//				}
//				
				
				
				
				
				//구현 부분	

				System.out.println();
			    System.out.println("merge:: ");
			    for ( String city: list3)
			    	System.out.print(city+ " ");
			   
			}	
}