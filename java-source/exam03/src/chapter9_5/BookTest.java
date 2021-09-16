
package chapter9_5;

import java.util.HashSet;

public class BookTest {
	public static void main(String[] args) {
		/**
		 * equals, hashCode() ->  
		 * TreeSet 
		 */
		HashSet<Book> list = new HashSet<>();
		list.add(new Book(100, ""));
		list.add(new Book(101, "2"));
		list.add(new Book(102, "3"));
		list.add(new Book(100, "1"));
		
		for (Book book : list) {
			System.out.println(book);
		}
	}
}