package Queue;

import Lists.List;

public abstract class AbstractQueue implements Queue {
	
	protected List elements;
	
	public void enqueue(int value) {
		elements.insert(elements.size(), value);
	}

	public int dequeue() {
		int value = elements.elementAt(0);
		elements.remove(0);
		return value;
	}

	public void clear() {
		int size = size();
		for(int i = 0; i < size; i++) {
			dequeue();
		}
	}
	
	public int size() {
		return elements.size();
	}
	
	public boolean isEmpty() {
		return elements.size() == 0;
	}

}
