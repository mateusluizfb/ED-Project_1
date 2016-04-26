package SymbolChecker;

import Stack.StackChar;

public class SymbolChecker {
	
	private String input;
	
	public SymbolChecker(String input){
		this.input = input;
	}
	
	public void checker(){
		
		int size = input.length();
		StackChar stack = new StackChar(size);
		
		for(int i = 0; i < size; i++){
			char c = input.charAt(i);
			
			switch(c){
				case '{':
				case '[':
				case '(':
					stack.push(c);
					break;
					
				case '}':
				case ']':
				case ')':
					if(stack.size() != 0){
						char c2 = (char) stack.pop();
						if ( (c == '}' && c2 == '{') ||
							 (c == ']' && c2 == '[') ||
							 (c == ')' && c2 == '(') ){
							System.out.println(c2 + " matches with " + c);
						} else {
							System.out.println("Not Valid " + c2 + " and " + c);
						}
						System.out.println("End");
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
