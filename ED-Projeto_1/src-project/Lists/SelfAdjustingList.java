package Lists;

public class SelfAdjustingList implements List {
	//por questoes de eficiencia, mantem o tamanho da lista. 
	private int size;
	
	//referencia para o primeiro no da lista. 
	private LinkedNode head;

	
	public SelfAdjustingList() {
		size = 0;
		head = null;
	}


	@Override
	public void insert(int pos, int value) {
		if(pos >= 0 && pos <= size) {
			if(size == 0) { //caso mais simples, lista vazia
				head = new LinkedNode(value);
			}
			else { //insere na posicao de indice zero, mas a lista nao esta vazia!
				LinkedNode newNode = new LinkedNode(value, head);
				head = newNode;
			}
			size++;
		}
	}
	

	@Override
	public int find(int value) {
		LinkedNode temp = head;
		for(int i = 0; i < size; i++) {
			if(temp.getValue() == value) {
				remove (i);
				insert(i, value);
				return i;
			}
			temp = temp.getNext();
		}
		return -1;
	}

	public int elementAt(int pos) {
		if(pos < 0 || pos >= size) {
			throw new InvalidArgumentException();
		}
		LinkedNode t = head;
		for(int i = 0; i < pos; i++) {
			t = t.getNext();
		}
		return t.getValue();
	}

	@Override
	public void remove(int pos) {
		if(pos < 0 || pos >= size) {
			throw new InvalidArgumentException();
		}
		if(pos == 0) {
			head = head.getNext();
		}
		else {
			LinkedNode temp = head; 
			for(int i = 0; i < pos - 1; i++) {
				temp = temp.getNext();
			}
			//temp aponta para o elemento anterior 
			//ao que deve ser excluido. 
			temp.setNext(temp.getNext().getNext());		
		}		
		size--;
	}


	@Override
	public int size() {
		return size;
	}
	
	@Override
	public void show(boolean reverse) {
		if(!reverse) {
			LinkedNode temp = head;
			for(int i = 0; i < size; i++) {
				System.out.println(temp.getValue());
				temp = temp.getNext();
			}
		}
		else {
			for(int i = size - 1; i >= 0; i--) {
				System.out.println(elementAt(i));
			}
		}
	}


	@Override
	public void swap(int index, int index2) {
		LinkedNode temp = head;
		LinkedNode temp2 = head;
		int i = 0;
		
		while(i != index){
			temp = temp.getNext();
			i++;
		}
		int smaller = temp.getValue();
		
		i = 0;
		while(i != index2){
			temp2 = temp2.getNext();
			i++;
		}
		
		temp.setValue(temp2.getValue());
		temp2.setValue(smaller);
	}
	
	public void setValue(int value){
		LinkedNode temp = head;
		temp.setValue(value);
	}


	@Override
	public void addAll(int[] array) {
		if (array.length <= size){
			LinkedNode temp = head;
			for(int i = 0; i < size; i++){
				temp.setValue(array[i]);
				temp = temp.getNext();
			}
		} else {
			throw new ArrayStoreException();
		}
		
	}
	
	
}
