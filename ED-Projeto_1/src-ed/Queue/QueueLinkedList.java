package Queue;

import Lists.LinkedList;

/**
 * Implementacao de uma Queue (Fila) usando LinkedList, a especificacao 
 * dos meotodos herdados de AbstractQueue esta na Interface Queue 
 *  
 * Neste projeto iremos apenas usar a Queue do tipo primitivo 'int'
 * @author MateusLuiz
 */

public class QueueLinkedList extends AbstractQueue{
	
	/**
	 * Construtor que inicializa 'elements' com uma LinkedList 
	 */
	
	public QueueLinkedList() {
		elements = new LinkedList();
	}
	
}
