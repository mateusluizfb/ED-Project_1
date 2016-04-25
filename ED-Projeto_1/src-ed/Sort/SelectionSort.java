package Sort;

import Lists.List;

public class SelectionSort implements AbstractSort{

	public List sort(List array){
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
    
        return array;
    }
	
	
}