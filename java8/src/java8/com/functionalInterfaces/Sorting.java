package java8.com.functionalInterfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CustomComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1;
	}
	
}
public class Sorting {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,12,3,4,45);
		
		System.out.println(list);
		// default or natural
//		Collections.sort(list);
		
		// or
		
//		Collections.sort(list, new CustomComparator());
		// or
		
		list.sort((a, b) -> b -a);
		System.out.println(list);
	}
}
