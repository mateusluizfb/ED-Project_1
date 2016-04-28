package ExpressionsUriJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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
	         if (check(data)){            
	        	n2 = stack.pop();
	        	n1 = stack.pop();
	            result = result(data.charAt(0), n1, n2);
	            stack.push (new Integer(result));
	         } else {
	            stack.push (new Integer(Integer.parseInt(data)));
	         }
	      }
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
	
	
	public static void main(String[] args) {
		
		ExpressionChecker pe = new ExpressionChecker();
		
		InputStreamReader r=new InputStreamReader(System.in);  
		BufferedReader br=new BufferedReader(r);  
		String string = null;
		  
		System.out.println("Enter Expression");  
		try {
			string = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}  
		
		System.out.println(pe.compute(string));
		
		
	}
	
}
