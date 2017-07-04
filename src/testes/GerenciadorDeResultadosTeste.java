package testes;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import classes.GerenciadorDeResultados;

public class GerenciadorDeResultadosTeste {

	@Test
	public void TestaResultados() throws Exception {
		
		//Arrange		
		String inputPath = "src/Teste_F/input/F_1";
		String outputPath = "src/Teste_F/output/F_1";
		
		GerenciadorDeResultados gerenciador = new GerenciadorDeResultados(inputPath,outputPath);
		int esperado = gerenciador.resultadoSobreposicao();
				
		//Act
		int atual = gerenciador.getResultado();
				
		//Assert
		assertEquals(esperado,atual);			
	}

}
