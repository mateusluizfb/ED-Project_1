package SymbolChecker;

import java.util.StringTokenizer;

import Stack.StackString;


public class SymbolChecker {
	
	private String input;
	
	public SymbolChecker(String input){
		this.input = input;
	}
	
	public void checker(){
		
		int size = input.length();
		StackString stack = new StackString(size);
		
		 String c;
	     StringTokenizer tokenizer = new StringTokenizer(input);
		
		while(tokenizer.hasMoreTokens()){
			c =  tokenizer.nextToken();
			
			switch(c){
				case "begin":
				case "{":
				case "[":
				case "(":
					stack.push(c);
					break;
				
				case "end":
				case "}":
				case "]":
				case ")":
					if(stack.size() != 0){
						String c2 = stack.pop();
						if ( (c.equals("}") && c2.equals("{")) ||
							 (c.equals("]") && c2.equals("[")) ||
							 (c.equals(")") && c2.equals("(")) ||
							 (c.equals("end") && c2.equals("begin")) ){
							System.out.println(c2 + " matches with " + c);
						} else {
							System.out.println("Not Valid: " + c2 + " and " + c);
						}
						break;
					}
				default: break;
			}
		}
		if (size == 0){
			System.out.println("Stack empty");
		} 
	}
}
