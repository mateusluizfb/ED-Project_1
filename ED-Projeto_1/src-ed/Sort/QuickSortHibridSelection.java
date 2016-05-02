package Sort;

import Lists.List;

public class QuickSortHibridSelection implements AbstractSort {

	private int[] array;
	
	@Override
	public List sort(List array) {
		int size = array.size();
		if (size <= 10){
			selection(array);
			return array;
		}
		this.array = new int[size];
		for(int i = 0; i < size; i++){
			this.array[i] = array.elementAt(i);
		}
		quickSort(0, size - 1);
		array.addAll(this.array);
		return array;
	}
	
	public void quickSort(int left, int right){
		if (right - left <= 0){
			return;
		} else {
			// pivot being last element
			int pivot = array[right];
			int partition = partition(left, right, pivot);
			quickSort(left, partition - 1);
			quickSort(partition + 1, right);
		}
	}
	
	public int partition(int left, int right, int pivot){
		
		int tempLeft = left - 1;
		int tempRight = right;
		
		while(true){
			
			while(array[++tempLeft] < pivot);
			while(array[--tempRight] > pivot && tempRight > 0);
			
			if (tempLeft >= tempRight){
				break;
			} else {
				swap(tempLeft, tempRight);
			}
		}
		swap(tempLeft, right);
		
		return tempLeft;
		
	}
	
	public void swap(int index,int index2){
		int temp = array[index];
		array[index] = array[index2];
		array[index2] = temp;
	}
	
	public void selection(List array){
		int index;
        int size = array.size();
        for (int i = 0; i < size - 1; i++){
            index = i;
            for (int j = i + 1; j < size; j++){
                if (array.elementAt(j) < array.elementAt(index)){
                    index = j;
                }
            }           
            array.swap(index, i);
        }
	}
}