package Sort;
public class SelectionSort{

	public void sort(int[] array){
        int index;
        
        for (int i = 0; i < array.length - 1; i++){
            index = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[index]){
                    index = j;
                }
            }
      
            int smaller = array[index]; 
            array[index] = array[i];
            array[i] = smaller;
        }
    }
	
	public void show(int[] array){
		for(int i=0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}