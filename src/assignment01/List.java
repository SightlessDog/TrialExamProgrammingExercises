package assignment01;

public class List<E> {
	
	Node<E> first;
	
	/**
	 * returns the position of the first occurrence of data
	 * in the linked list.
	 * @param E data - the data to search for
	 */
	public int getIndex(E data){
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
