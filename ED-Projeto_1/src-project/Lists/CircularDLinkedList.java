package Lists;

public class CircularDLinkedList extends DLinkedList {
	
	@Override
	public void insert(int pos, int value){
		if(pos > 0 || pos <= size) {
			if(size == 0) {
				head = new DLinkedNode(value);
				tail = head;
			}
			else if(pos == 0) {
				DLinkedNode newNode = new DLinkedNode(value);
				newNode.setNext(head);
				newNode.setPrevious(tail);
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
				} else {
					tail = newNode;
					newNode.setNext(head);
				}
			}
			size++;
		}
		else {
			throw new InvalidArgumentException();
		}
	}
	
	@Override
	public void remove(int pos) throws InvalidArgumentException {
		if (pos > 0 || pos <= size){
			if (pos == 0){
				head.getNext().setPrevious(tail);
				head = head.getNext();
				tail.setNext(head);
			} else {
				DLinkedNode temp = head;
				DLinkedNode temp2 = head;
				for(int i = 0; i < pos - 1; i++){
					temp = temp.getNext();
				}
				for(int i = 0; i < pos + 1; i++){
					temp2 = temp2.getNext();
				}
				temp.setNext(temp.getNext().getNext());
				if (temp.getPrevious().getPrevious() != null){
					temp2.setPrevious(temp2.getPrevious().getPrevious());
				}
				if (pos == size){
					tail = temp;
					tail.setNext(head);
				}
			}
			size--;
		} else {
			throw new InvalidArgumentException();
		}
	}
	
}
