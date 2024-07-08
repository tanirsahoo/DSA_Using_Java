package Collection_Framework;

import java.util.Iterator;
import java.util.Vector ;
import java.util.ArrayList ;
import java.util.List ;

public class array_list {
	public static void main(String[] args) {
//		Vector<Integer> ar = new Vector<>() ;
//
//		ar.add(20) ;
//		ar.add(0 , 10) ;

		List<Integer> lt = new ArrayList<>() ;
		lt.add(10) ;
		lt.add(20) ;

		List<Integer> newlt = new ArrayList<>() ;
		newlt.add(15) ;
		newlt.add(25) ;
		lt.addAll(newlt) ;
		System.out.println("The element is: " + lt) ;

		lt.remove(2) ;
		System.out.println("The element is: " + lt) ;
		lt.remove(Integer.valueOf("25")) ;
		System.out.println("The element is: " + lt) ;
		System.out.println("The element is: " + lt.contains(10)) ; // Checks whether an element is present in the list or not
		for(int i = 0 ; i < lt.size() ; i ++)
			System.out.println("The element is: " + lt.get(i));
		System.out.println("==============================");
		for(int item : lt){
			System.out.println("The element is: " + item);
		}
		System.out.println("------------------------------");
		Iterator<Integer> it = lt.iterator() ;
		while(it.hasNext()){
			System.out.println("Iterator: " + it.next());
		}

		lt.clear();
		System.out.println("The element is: " + lt) ;

	}
}
