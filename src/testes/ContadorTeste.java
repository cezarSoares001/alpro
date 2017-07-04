package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Contador;

public class ContadorTeste {

	@Test
	public void TestaContagem() {
		
		//Arrange
		Contador.adicionar(3);
		int esperado = 3;
				
		//Act
		int atual = (int) Contador.getContador();
				
		//Assert
		assertEquals(esperado,atual);
				
				
	}

}
