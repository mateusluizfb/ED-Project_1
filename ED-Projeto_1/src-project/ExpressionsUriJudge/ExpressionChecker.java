package ExpressionsUriJudge;

import java.util.StringTokenizer;

import Lists.InvalidArgumentException;
import Stack.Stack;
import Stack.StackArrayList;

/**
 * Classe que implementa uma calculadora posfixa
 * 
 * @author MateusLuiz
 */

public class ExpressionChecker{
	
	   private final char add = '+', sub = '-', multi = '*', div = '/';

	   private Stack stack;

	   /**
	    * incializa 'stack' com uma StackArrayList
	    */
	   public ExpressionChecker(){
	      stack = new StackArrayList();
	   }
	   
	   /**
	    * Compute calcula a expressao pos fixa e retorna
	    * o resultado
	    * 
	    * @param string expressao a ser calculada
	    * @return resultado da expressao
	    */

	   public int compute(String string){

	      int n1;
	      int n2;
	      int result = 0;
	      
	      String data;
	      StringTokenizer tokenizer = new StringTokenizer(string);

	      while (tokenizer.hasMoreTokens()){
	         data = tokenizer.nextToken();
	         try{
		         if (check(data)){            
		        	n2 = stack.pop();
		        	n1 = stack.pop();
		            result = result(data.charAt(0), n1, n2);
		            stack.push (new Integer(result));
		         } else {
		            stack.push (new Integer(Integer.parseInt(data)));
		         }
	         } catch (InvalidArgumentException e){
	        	 System.out.println("Invalid Expression");
	        	 break;
	         }
	      }
	      stack.clear();
	      return result;
	   }
	   
	   /**
	    *  Metodo que efetivamente calcula e retorna o valor 
	    *  da operacao dada
	    * 
	    * @param ch operacao
	    * @param n1 numero a ser aplicado na operacao
	    * @param n2 numero2 a ser aplicado na operacao
	    * @return o resultado da operacao de n1 e n2
	    */
	   
	   protected int result(char ch, int n1, int n2){
	      int result = 0;

	      switch (ch){
	         case add: result = n1 + n2;
	            break;
	         case sub: result = n1 - n2;
	            break;
	         case multi: result = n1 * n2;
	            break;
	         case div: result = n1 / n2;
	      }
	      return result;
	   }
	   
	   /**
	    * Checa se o caractere 'data' e igual a alguma operacao
	    * 
	    * @param data operacao
	    * @return true ou false dependendo a operacao
	    */

	   protected boolean check(String data){
	      return ( data.equals("+") || data.equals("-") || data.equals("*") || data.equals("/") );
	   }	
}
