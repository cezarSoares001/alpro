package testes;

import static org.junit.Assert.*;
import static classes.Contagem.*;
import org.junit.Test;

import classes.ArvoreTernaria;

public class ArvoreTernariaTeste {

	@Test
	public void verificaMatrizNovaDeUmaArvoreCanhotaSemNodos() throws Exception {

		// Arrange
		ArvoreTernaria arvoreGenerica = new ArvoreTernaria('C', 3);
		String esperado = "";
		esperado = "\n" + "0 0 0 " + "\n";
		esperado += "0 0 0 " + "\n";
		esperado += "0 0 0 " + "\n";

		// Act
		String atual = arvoreGenerica.toString();

		// Assert
		assertEquals(esperado, atual);
		System.out.println(getCounter());
	}

	@Test
	public void confereInsercaoDeUmNodoEmUmaArvoreCanhotaComSeuFilhoExternoESeuFilhoExterno() throws Exception {

		// Arrange
		ArvoreTernaria arvoreCanhota = new ArvoreTernaria('C', 3);
		arvoreCanhota.addNodo(1, 2, 3);
		String esperado = "";
		esperado = "\n" + "1 2 3 " + "\n";
		esperado += "0 0 0 " + "\n";
		esperado += "0 0 0 " + "\n";

		// Act
		String atual = arvoreCanhota.toString();

		// Assert
		assertEquals(esperado, atual);
	}

	@Test
	public void confereInsercaoDeUmNodoEmUmaArvoreCanhotaSemFilhos() throws Exception {

		// Arrange
		ArvoreTernaria arvoreCanhota = new ArvoreTernaria('C', 3);
		arvoreCanhota.addNodo(1, 0, 0);
		String esperado = "";
		esperado = "\n" + "1 0 0 " + "\n";
		esperado += "0 0 0 " + "\n";
		esperado += "0 0 0 " + "\n";

		// Act
		String atual = arvoreCanhota.toString();

		// Assert
		assertEquals(esperado, atual);
	}

	@Test
	public void confereInsercaoDeMaisDEUmNodoEmUmaArvoreCanhotaComSeuFilhoExternoESeuFilhoExterno() throws Exception {

		// Arrange
		ArvoreTernaria arvoreCanhota = new ArvoreTernaria('C', 5);
		arvoreCanhota.addNodo(1, 2, 3);
		arvoreCanhota.addNodo(2, 4, 5);
		arvoreCanhota.addNodo(3, 0, 0);

		String esperado = "";
		esperado = "\n" + "1 2 3 " + "\n";
		esperado += "2 4 5 " + "\n";
		esperado += "3 0 0 " + "\n";
		esperado += "0 0 0 " + "\n";
		esperado += "0 0 0 " + "\n";

		// Act
		String atual = arvoreCanhota.toString();

		// Assert
		assertEquals(esperado, atual);
	}

	@Test
	public void confereInsercaoDeMaisDeUmNodoEmUmaArvoreDestraComSeuFilhoExternoESeuFilhoExterno() throws Exception {

		// Arrange
		ArvoreTernaria arvoreDestra = new ArvoreTernaria('D', 5);
		arvoreDestra.addNodo(1, 2, 0);
		arvoreDestra.addNodo(2, 0, 3);
		arvoreDestra.addNodo(3, 4, 0);
		arvoreDestra.addNodo(4, 5, 0);
		arvoreDestra.addNodo(5, 0, 0);

		String esperado = "";
		esperado = "\n" + "1 2 0 " + "\n";
		esperado += "2 0 3 " + "\n";
		esperado += "3 4 0 " + "\n";
		esperado += "4 5 0 " + "\n";
		esperado += "5 0 0 " + "\n";

		// Act
		String atual = arvoreDestra.toString();

		// Assert
		assertEquals(esperado, atual);
	}

	@Test
	public void ConfereEEetornaUmaArvoreCanhotaAtravesDeUmMetodoGet() throws Exception {

		// Arrange
		ArvoreTernaria arvoreCanhota = new ArvoreTernaria('C', 5);
		arvoreCanhota.addNodo(1, 2, 3);
		arvoreCanhota.addNodo(2, 4, 5);
		arvoreCanhota.addNodo(3, 0, 0);

		int[][] esperado = new int[5 + 1][3 + 1];

		esperado[1][1] = 1;
		esperado[1][2] = 3;
		esperado[1][3] = 2;

		esperado[2][1] = 2;
		esperado[2][2] = 5;
		esperado[2][3] = 4;

		esperado[3][1] = 3;
		esperado[3][2] = 0;
		esperado[3][3] = 0;

		// Act
		int[][] atual = arvoreCanhota.getArvore();

		// Assert
		assertArrayEquals(esperado, atual);

	}

	@Test
	public void verificaEretornaOTamanhoDoCaminhoCentralAPartirDaRaizDeUmaArvoreCanhota() throws Exception {

		// Arrange
		ArvoreTernaria arvoreDestra = new ArvoreTernaria('C', 7);
		arvoreDestra.addNodo(1, 2, 3);
		arvoreDestra.addNodo(2, 0, 0);
		arvoreDestra.addNodo(3, 4, 0);
		arvoreDestra.addNodo(4, 0, 5);
		arvoreDestra.addNodo(5, 0, 6);
		arvoreDestra.addNodo(6, 7, 0);
		arvoreDestra.addNodo(7, 0, 0);

		int esperado = 2;

		// Act
		int atual = arvoreDestra.getCaminhoCentralRaiz();

		// Assert
		assertEquals(esperado, atual);
	}

	@Test
	public void verificaEretornaOTamanhoDoCaminhoCentralAPartirDaRaizDeUmaArvoreDestra() throws Exception {

		// Arrange
		ArvoreTernaria arvoreDestra = new ArvoreTernaria('D', 7);
		arvoreDestra.addNodo(1, 2, 3);
		arvoreDestra.addNodo(2, 4, 0);
		arvoreDestra.addNodo(3, 5, 0);
		arvoreDestra.addNodo(4, 0, 6);
		arvoreDestra.addNodo(5, 0, 0);
		arvoreDestra.addNodo(6, 0, 7);
		arvoreDestra.addNodo(7, 0, 0);

		int esperado = 3;

		// Act
		int atual = arvoreDestra.getCaminhoCentralRaiz();

		// Assert
		assertEquals(esperado, atual);
	}

	@Test
	public void verificaERetornaOTamanhoDoMaiorCaminhoCentralDeUmaArvoreCanhota() throws Exception {

		// Arrange
		ArvoreTernaria arvoreDestra = new ArvoreTernaria('C', 7);
		arvoreDestra.addNodo(1, 2, 3);
		arvoreDestra.addNodo(2, 0, 0);
		arvoreDestra.addNodo(3, 4, 0);
		arvoreDestra.addNodo(4, 0, 5);
		arvoreDestra.addNodo(5, 0, 6);
		arvoreDestra.addNodo(6, 7, 0);
		arvoreDestra.addNodo(7, 0, 0);

		int esperado = 3;

		// Act
		int atual = arvoreDestra.getMaiorCaminhoCentral();

		// Assert
		assertEquals(esperado, atual);

	}

	@Test
	public void verificaERetornaOTamanhoDoMaiorCaminhoCentralDeUmaArvoreDestra() throws Exception {

		// Arrange
		ArvoreTernaria arvoreDestra = new ArvoreTernaria('D', 7);
		arvoreDestra.addNodo(1, 2, 3);
		arvoreDestra.addNodo(2, 4, 0);
		arvoreDestra.addNodo(3, 5, 0);
		arvoreDestra.addNodo(4, 0, 6);
		arvoreDestra.addNodo(5, 0, 0);
		arvoreDestra.addNodo(6, 0, 7);
		arvoreDestra.addNodo(7, 0, 0);

		int esperado = 3;

		// Act
		int atual = arvoreDestra.getCaminhoCentralRaiz();

		// Assert
		assertEquals(esperado, atual);
	}
	
	

}
