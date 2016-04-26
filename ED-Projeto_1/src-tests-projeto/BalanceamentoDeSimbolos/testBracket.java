package BalanceamentoDeSimbolos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import junit.framework.TestCase;

public class testBracket extends TestCase {
	
	public void testChecker(){
			
		InputStreamReader r=new InputStreamReader(System.in);  
		BufferedReader br=new BufferedReader(r);  
		String bracket = null;
		  
		System.out.println("Enter Bracket");  
		try {
			bracket=br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}  
		
		Bracket check = new Bracket(bracket);
			
		check.checker();
		
	}

}
