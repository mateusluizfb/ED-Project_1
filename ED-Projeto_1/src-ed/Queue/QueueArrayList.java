package Queue;

import Lists.ArrayList;

/**
 * Implementacao de uma Queue (Fila) usando ArrayList, a especificacao 
 * dos meotodos herdados de AbstractQueue esta na Interface Queue 
 *  
 * Neste projeto iremos apenas usar a Queue do tipo primitivo 'int'
 * @author MateusLuiz
 */

public class QueueArrayList extends AbstractQueue{

	/**
	 * Construtor que inicializa 'elements' com uma ArrayList 
	 */
	public QueueArrayList(){
		elements = new ArrayList();
	}
}
