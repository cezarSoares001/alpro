package classes;

import static classes.Contagem.*;

public class ArvoreTernaria {

	int[][] matrizArvore;
	char tipoArvore;
	int numeroNodo;

	public ArvoreTernaria(char tipoArvore, int quantidadeNodos) {

		this.tipoArvore = tipoArvore;
		matrizArvore = new int[quantidadeNodos + 1][3 + 1];// +1 desconsidera
															// indice zero
	}

	public ArvoreTernaria() {

		this.tipoArvore = 'C';
		matrizArvore = new int[1][1];// +1 desconsidera oindice zero
	}

	public int[][] getArvore() {

		return matrizArvore;
	}

	public void addNodo(int nodo, int segundoNodo, int terceiroNodo) {

		if (tipoArvore == 'C') { // Canhota

			matrizArvore[nodo][1] = nodo;
			matrizArvore[nodo][2] = terceiroNodo; // central
			matrizArvore[nodo][3] = segundoNodo; // externo

		} else { // Destra

			matrizArvore[nodo][1] = nodo;
			matrizArvore[nodo][2] = segundoNodo; // central
			matrizArvore[nodo][3] = terceiroNodo; // externo

		}
	}

	public int getCaminhoCentralRaiz() {

		int contadorCaminho = 1;
		numeroNodo = 1;

		while (true) {

			if (matrizArvore[numeroNodo][2] != 0) {
				contadorCaminho++;
				numeroNodo = matrizArvore[numeroNodo][2];
			} else
				break;
		}
		return contadorCaminho;

	}

	public int getMaiorCaminhoCentral() {
		add(2);
		int contadorInicial = getCaminhoCentralRaiz();
		add(4);
		if (contadorInicial == matrizArvore.length - 1) {
			add(1);
			return contadorInicial;
		}
		add(4);
		int contadorCaminho = 1;
		int contadorNodo = 0;
		numeroNodo++;

		while (contadorNodo < matrizArvore.length) {
			add(2);
			while (matrizArvore[numeroNodo][2] != 0) {
				add(4);

				contadorCaminho++;
				numeroNodo = matrizArvore[numeroNodo][2];
				add(4);
				while (true) {

					if (matrizArvore[numeroNodo][2] != 0) {
						add(4);
						contadorCaminho++;
						numeroNodo = matrizArvore[numeroNodo][2];
						add(5);
					} else
						break;
				}
				if (matrizArvore[numeroNodo][3] != 0 && contadorInicial < contadorCaminho) {
					add(6);
					contadorInicial = contadorCaminho;
					numeroNodo++;
					contadorCaminho = 1;
					add(4);
				}
				if (matrizArvore[numeroNodo][3] == 0 && contadorInicial < contadorCaminho) {
					add(6);
					contadorInicial = contadorCaminho;
					add(1);
				}
				if (matrizArvore[numeroNodo][3] != 0 && contadorInicial > contadorCaminho) {
					add(6);
					numeroNodo++;
					contadorCaminho = 1;
					add(3);
				}
				contadorNodo = numeroNodo;
				add(1);
			}
			contadorNodo++;
			contadorCaminho = 1;
			numeroNodo = contadorNodo;
			add(4);
		}
		add(1);

		return contadorInicial;
	}

	public String toString() {

		String stringTemp = "";

		if (tipoArvore == 'C') {

			for (int linha = 1; linha < matrizArvore.length; linha++) {
				for (int coluna = 1; coluna <= 3; coluna++) {
					if (coluna == 2) {
						stringTemp += Integer.toString(matrizArvore[linha][3]) + " ";
					} else if (coluna == 3) {
						stringTemp += Integer.toString(matrizArvore[linha][2]) + " ";
					} else
						stringTemp += Integer.toString(matrizArvore[linha][coluna]) + " ";
				}
				stringTemp = stringTemp + "\n";
			}

		} else {
			for (int linha = 1; linha < matrizArvore.length; linha++) {
				for (int coluna = 1; coluna < matrizArvore[0].length; coluna++) {
					stringTemp += Integer.toString(matrizArvore[linha][coluna]) + " ";
				}
				stringTemp = stringTemp + "\n";
			}
		}
		return "\n" + stringTemp + "iteraçoes : " + getCounter();
	}

}