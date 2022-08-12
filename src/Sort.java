/*
 * 객체 정령하기
 * 1. 배열 정렬하기
 * -Array.sort()
 * -Comparable interface
 * 
 * 
 */

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
	private List<Student> list;

	public Sort(List<Student> list) {
		this.list = list;
	}
	
	public void sort() {
		Collections.sort(this.list, new Comparator<Student>() {
			@Override
			public int compare(Student front, Student back) {
//				return back.getTot() - front.getTot(); // 총점기준 내림차순 sort
				return front.getName().compareTo(back.getName());  //이름 기준 오름차순 sort //문자열 비교 .compareto
			}
		});
	}

//	public void sort() {
//		Collections.sort(this.list, new MyComparator());
//	}
//
//	class MyComparator implements Comparator<Student> {
//
//		@Override
//		public int compare(Student front, Student back) {
//			return back.getTot() - front.getTot();
//		}
//	}
}
