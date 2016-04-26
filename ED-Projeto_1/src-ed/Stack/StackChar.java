package Stack;

public class StackChar{
	
	public char[] elements;
	public int size;
	
	public StackChar(int size){
		elements = new char[size];
		size = 0;
	}
	
	public boolean isEmpty() {
		return (elements.length == 0);
	}
	

	public void push(char c) {
		elements[size] = c;
		size++;
	}

	public char pop() {
		char value = elements[size - 1];
		size--;
		return value;
	}

	
	public int size() {
		return elements.length;
	}

	
	public void clear() {
		int temp = size();
		for(int i = 0; i < temp; i++) {
			pop();
		}
	}


	public char top() {
		char value = elements[size-1];
		return value;
	}
}
