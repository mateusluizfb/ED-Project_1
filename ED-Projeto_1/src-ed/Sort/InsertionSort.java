package Sort;

import Lists.List;

public class InsertionSort implements AbstractSort{

	public List sort(List array) {
		int temp;
		int size = array.size();
		for(int i = 1 ; i < size; i++){
			for(int j = i; j > 0; j--){
				if (array.elementAt(j) < array.elementAt(j - 1)){
					temp = array.elementAt(j);
					array.swap(temp, j, j - 1);
				}
			}
		}
		return array;
	}

}