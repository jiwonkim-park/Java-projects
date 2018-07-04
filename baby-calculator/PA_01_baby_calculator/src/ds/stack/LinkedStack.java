package ds.stack;

import ds.list.Link;
import ds.list.LinkedList;

public class LinkedStack<E> implements Stack<E> {
	
	protected Link<E> top;
	protected LinkedList<E> list;
	private int size;
	
	public LinkedStack() {
		top = null;
		size = 0;
		list = new LinkedList<E>();
	}

	@Override
	public void clear() {
		while (size > 0) {
			list.remove(0);
			size--; 
		}
	}

	@Override
	public void push(E item) {
		list.insert(0, item);
		size++;
	}

	@Override
	public E pop() {
		if (isEmpty()) {
			return null;
		} else {
			E item = list.getValue(0);
			list.remove(0);
			size--;
			return item;
		}
	}

	@Override
	public int length() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

}
