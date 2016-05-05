package SymbolChecker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import SymbolChecker.SymbolChecker;
import junit.framework.TestCase;

public class testBracket extends TestCase {
	
	public void testChecker(){
		
		//Não foi possivel realizar os testes
		// unitarios via 'assertEquals()',
		// logo o teste tem que ser feio via entrada manual de dados
		
		//O INPUT DEVE SER FEITO COM ESPACOS 
			
		InputStreamReader r=new InputStreamReader(System.in);  
		BufferedReader br=new BufferedReader(r);  
		String bracket = null;
		  
		System.out.println("Enter Bracket");  
		try {
			bracket=br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}  
		
		SymbolChecker check = new SymbolChecker(bracket);
		
		
		check.checker();
		
	}

}
