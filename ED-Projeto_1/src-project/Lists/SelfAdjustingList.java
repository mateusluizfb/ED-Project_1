package Lists;


public class SelfAdjustingList implements List {
	
	private static final int MAX_SIZE = 10;   //constante
	private static final int NOT_FOUND = -1;  //constante
	
	private int[] elements;  //array que vai conter os elementos da lista
	private int size; 
	
	public SelfAdjustingList() {
		size = 0;
		elements = new int[MAX_SIZE]; //aloca espaco para um array de 10 posicoes 
	}
	
	public int find(int v) {
		for(int i = 0; i < size; i++) {
			if(v == elements[i]) {
				remove (i);
				insert(0, v);
				return 0;
			}
		}
		return NOT_FOUND;
	}
	
	public int elementAt(int pos) {
		//TODO: o que fazer quando pos nao for um indice valido? 
		return elements[pos];
	}
	
	public void insert(int z, int v) {
		elements[0] = v; 
	}
	
	public void remove(int pos) {
		size--;
	}
	
	public int size() {
		return size; 
	}
	
	public void show(boolean reverse) {
		if (!reverse){
			for(int i=0; i < size; i++){
				System.out.print(elements[i] + " ");
			}
		} else {
			for(int i=size; i >= 0; i--){
				System.out.print(elements[i] + " ");
			}
		}
	}

	public void swap(int index, int index2){
		int smaller = elements[index];
		elements[index] = elements[index2];
		elements[index2] = smaller;
	}
	@Override
	public void addAll(int[] array) {
		// TODO Auto-generated method stub
		
	}
	
	
}
