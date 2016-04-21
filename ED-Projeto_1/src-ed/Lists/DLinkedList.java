package Lists;

class DLinkedNode {
	private int value;
	private DLinkedNode next;
	private DLinkedNode previous; 
	
	public DLinkedNode(int value) {
		this.value = value;
		next = null;
		previous = null;
	}

	public DLinkedNode getNext() {
		return next;
	}

	public void setNext(DLinkedNode next) {
		this.next = next;
	}

	public DLinkedNode getPrevious() {
		return previous;
	}

	public void setPrevious(DLinkedNode previous) {
		this.previous = previous;
	}

	public int getValue() {
		return value;
	}
}

public class DLinkedList implements List {
	private int size; 
	private DLinkedNode head; 
	
	public DLinkedList() {
		size = 0;
		head = null;
	}
	
	@Override
	public void insert(int pos, int value) {
		if(pos >= 0 && pos <= size) {
			if(size == 0) {
				head = new DLinkedNode(value);
			}
			else if(pos == 0) {
				DLinkedNode newNode = new DLinkedNode(value);
				newNode.setNext(head);
				head.setPrevious(newNode);
				head = newNode;
			}
			else {
				DLinkedNode temp = head; 
				for(int i = 0; i < pos - 1; i++) {
					temp = temp.getNext();
				}
				DLinkedNode newNode = new DLinkedNode(value);
				newNode.setNext(temp.getNext());
				newNode.setPrevious(temp);
				temp.setNext(newNode);
				if(pos < size) {
					newNode.getNext().setPrevious(newNode);
				}
			}
			size++;
		}
		else {
			throw new InvalidArgumentException();
		}
	}

	@Override
	public int find(int value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int elementAt(int pos) throws InvalidArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void remove(int pos) throws InvalidArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void show(boolean reverse) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swap(int index, int i) {
		throw new NotImplementedYet();
	}

	@Override
	public void addAll(int[] array) {
		// TODO Auto-generated method stub
		
	}
}
