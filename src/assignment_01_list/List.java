package assignment_01_list;

/**
 * Assignment 01: 
 * Implement the getIndex() method.
 * 
 */
public class List<E> {
	
	Node<E> first;
	
	/**
	 * Returns the position of the first occurrence of data
	 * in the linked list, starting at 1.
	 * 
	 * It should return -1 if
	 * - null is passed as an argument
	 * - the list is empty, or
	 * - the list doesn't contain the element.
	 * 
	 * Comparison is done by calling equals() on the data.
	 * 
	 * @param E data - the data to search for
	 */
	public int getIndex(E data){
		// replace with your code
		return -1;
		
	}
	/**
	 * adds data as first element to the list
	 * @param E data - the data to add
	 */
	public void add(E data) {
		first = new Node<E>(data,first);
	}
}
