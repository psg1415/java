package chapter12_2.hashset;

import java.util.TreeSet;
import java.util.Comparator;

public class Ex2 {
	public static void main(String[] args) {
		Comparator<String> com = new Comparator<>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2) * -1;
			}
			
		};
		
		TreeSet<String> list = new TreeSet<>(com);
		/**
		 * String 클래스에도 정렬의 기준이 이미 구현되어 있다
		 * java.lang.Comparable(int compareTo), java.util.Comparator(int compare)
		 * 오름차순 -> 기본정렬, 내림차순
		 */
		list.add(new String("이름1"));
		list.add(new String("이름3"));
		list.add(new String("이름2"));
		list.add(new String("이름4"));
		
		for (String s : list) {
			System.out.println(s);
		}
	}
}