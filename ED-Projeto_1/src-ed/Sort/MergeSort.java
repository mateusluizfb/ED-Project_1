package Sort;

import Lists.List;

public class MergeSort implements AbstractSort{

	private int[] tempArray;
	private int[] workspaceArray;
	private int size;
	
	@Override
	public List sort(List array) {
		this.size = array.size();
		tempArray = new int[size];
		for(int i = 0; i < size; i++){
			tempArray[i] = array.elementAt(i);
		}
		workspaceArray = new int[size];
		divideAndConquer(0, size - 1);
		array.addAll(tempArray);
		return array;
	}
	
	public void divideAndConquer(int low, int high){
		int middle = (high + low)/ 2;
		if (low < high){
			divideAndConquer(low, middle);
			divideAndConquer(middle + 1, high);
			merge(low, middle, high);
		}
	}
	
	public void merge(int low, int middle, int high){
		for (int i = 0; i < size; i++) {
			workspaceArray[i] = tempArray[i];
		}
		
		int i = low;
		int j = middle + 1;
		int k = low;
		
		while(i <= middle && j <= high){
			if (workspaceArray[i] < workspaceArray[j]){
				tempArray[k++] = workspaceArray[i++];
			} else {
				tempArray[k++] = workspaceArray[j++];
			}
		}
		
		while (i <= middle){
			tempArray[k++] = workspaceArray[i++];
		}
		
		while (j <= high) {
			tempArray[k++] = workspaceArray[j++];
		}
	}
	
	
	
	

}
