package ExpressionsUriJudge;

import java.util.StringTokenizer;

import Lists.InvalidArgumentException;
import Stack.Stack;
import Stack.StackArrayList;


public class ExpressionChecker
	{
	   private final char add = '+', sub = '-', multi = '*', div = '/';

	   private Stack stack;

	   public ExpressionChecker(){
	      stack = new StackArrayList();
	   }

	   public int compute(String string){

	      int n1;
	      int n2;
	      int result = 0;
	      
	      String data;
	      StringTokenizer tokenizer = new StringTokenizer(string);

	      while (tokenizer.hasMoreTokens() == true){
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
	        	 throw new InvalidArgumentException("Invalid Expression");
	         }
	      }
	      stack.clear();
	      return result;
	   }
	   
	   private int result(char ch, int n1, int n2)
	   {
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

	   private boolean check(String data){
	      return ( data.equals("+") || data.equals("-") || data.equals("*") || data.equals("/") );
	   }	
}
