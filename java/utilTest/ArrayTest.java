package utilTest;

import java.util.ArrayList;

public class ArrayTest {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(1);
		arr.add("안녕");
		arr.add(3.2);
		System.out.println("마지막 :"+ arr.get(arr.size()-1));  //arr[2]
		System.out.println(arr.size());
		arr.add(new Integer(3));
		System.out.println("크기 :"+arr.size());
		System.out.println("마지막 :"+arr.get(arr.size()-1));  //arr[2]
		arr.remove(1);
		arr.remove("안녕");
		System.out.println("크기 :"+arr.size());
		arr.add(1, "지금 자바");
		System.out.println("크기 :"+arr.size());
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("자바");
		alist.add("Java");
		for(int i = 0; i<alist.size();i++) {
			System.out.println(alist.get(i));
		}
		for(String s : alist) {
			System.out.print( s +"\t");
		}
		System.out.println();
		for(Integer i : list) {
			System.out.print( i +"\t");

		}
		
		
		
	}

}
