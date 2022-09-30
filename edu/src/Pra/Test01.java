package Pra;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Test01 {

	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList<String>();
		list.add("아반떼"); list.add("소나타"); 
		list.add("투싼"); list.add("그랜져"); 
		list.add("아이오닉"); list.add("제네시스");
		
		System.out.println(1+ ":" + list);
		list.add("k3"); print(2,list);
		
		System.out.println(3+":"+ list.indexOf("투싼"));
		System.out.println(4+":"+ list.lastIndexOf("k3"));
		
		list.remove("아반떼"); print(5,list);
		list.remove(1); print(6,list);
		
		System.out.println(7+":"+list.contains("소나타"));
		
		Object obj[] = list.toArray();
		System.out.println(8+":"+Arrays.toString(obj));
	
		list.clear();print(9,list);
		System.out.println(10+":"+list.isEmpty());
		list.add("k5"); list.add("넥쏘"); list.add("스포티지"); list.add("테슬라");
		
//		List<String> list2 =Arrays.asList("")
		
		
		
		

	
	
//		for(int i=0; i< list.size(); i++) {
//			System.out.println(list.get(i));
//		System.out.println("1 : " + list.toString());
		
		}
	
	public static void print(int n, List<String>list) {
		System.out.println(n+ ":"+ list );
}
	}


