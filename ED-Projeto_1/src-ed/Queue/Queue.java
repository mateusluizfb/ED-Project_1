package Queue;


public interface Queue{
	
	public boolean isEmpty();
	
	
	public void enqueue(int value);
	
	
	public int dequeue();
	
	
	public int size();
	
	
	public void clear();
}
