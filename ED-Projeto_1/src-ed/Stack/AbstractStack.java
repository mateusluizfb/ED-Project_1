package Stack;

import Lists.List;

public abstract class AbstractStack implements Stack{
	
	public List elements;
	
	public boolean isEmpty() {
		return (elements.size() == 0);
	}
	

	public void push(int value) {
		elements.insert(elements.size(), value);
	}

	
	public int pop() {
		int value = elements.elementAt(elements.size()-1);
		elements.remove(elements.size() - 1);
		return value;
	}

	
	public int size() {
		return elements.size();
	}

	
	public void clear() {
		int temp = size();
		for(int i = 0; i < temp; i++) {
			pop();
		}
	}


	public int top() {
		int value = elements.elementAt(elements.size()-1);
		return value;
	}

}
