package ds.list;

public class LinkedList<E> implements List<E> {
	
	private Link<E> head;
	private Link<E> tail;
	int count;
	
	public LinkedList () {
		head = tail = new Link<E> (null, null);
		count = 0;
	}
	

	@Override
	public void clear() {
		head.setNext(null);
		head = new Link<E> (null, null);
		count = 0;
	}

	@Override
	public void insert(int pos, E item) {
		Link<E> temp = head;
		int i = 0;
		while (i < pos) {
			temp = temp.next();
			i++;
		}
		temp.setNext(new Link<E>(item, temp.next()));
		if (temp == tail) {
			tail = temp.next();
		}
		count++;
	}

	@Override
	public E remove(int pos) {
		Link<E> temp = head;
		if (temp.next() == null) {
			return null;
		}
		for (int i = 0; i < pos; i++){
			temp = temp.next();
		}
		E it = temp.next().getElement();
		if (temp.next() == tail) {
			tail = temp;
		} else {
			temp.setNext(temp.next().next());
		}
		count--;
		return it;
	}

	@Override
	public int length() {
		return count;
	}

	@Override
	public E getValue(int pos) {
		if (pos < 0 || pos > count){
			return null;
		}
		Link<E> temp = head;
		for (int i = 0; i < pos; i++){
			temp = temp.next();
		}
		return temp.next().getElement();
	}

}
