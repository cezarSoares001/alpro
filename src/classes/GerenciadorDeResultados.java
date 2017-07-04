package classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GerenciadorDeResultados {

	ArvoreEnraizada enraizada = new ArvoreEnraizada();
	ArvoreTernaria canhota;
	ArvoreTernaria destra;

	BufferedReader buffReadInput;
	BufferedReader buffReadOutput;
	int resultado;

	public GerenciadorDeResultados(String inputPath, String outputPath) throws Exception {

		buffReadInput = new BufferedReader(new FileReader(inputPath));
		buffReadOutput = new BufferedReader(new FileReader(outputPath));
		resultado = Integer.parseInt(buffReadOutput.readLine());
		leArvoresTernarias();
	}

	public int getResultado(){
		return resultado;
	}
	
	public int resultadoSobreposicao() throws Exception{
		
		int saida = enraizada.superposicaoDeArvores(canhota, destra);
		
		return saida;
		
	}
		
	private void leArvoresTernarias() throws Exception{

		String linha = buffReadInput.readLine();
		canhota = new ArvoreTernaria();
		destra = new ArvoreTernaria();
		boolean verifica = false;

		while (true) {
			if (linha != null) {

				String[] valores = linha.split(" ");

				if (valores.length == 1) {
					if (verifica == false) {
						canhota = new ArvoreTernaria('C', Integer.parseInt(valores[0]));
						verifica = true;
					} else {
						destra = new ArvoreTernaria('D', Integer.parseInt(valores[0]));
						verifica = false;
					}
				}
				if (valores.length != 1 && verifica == true) {
					canhota.addNodo(Integer.parseInt(valores[0]), Integer.parseInt(valores[1]),
							Integer.parseInt(valores[2]));
				}
				if (valores.length != 1 && verifica == false) {
					destra.addNodo(Integer.parseInt(valores[0]), Integer.parseInt(valores[1]),
							Integer.parseInt(valores[2]));
				}

				linha = buffReadInput.readLine();
			}

			else
				break;
		}
	}

	public boolean comparaResultados() {

		int saida = enraizada.superposicaoDeArvores(canhota, destra);
		
		//System.out.println(canhota.toString());
	    //System.out.println(destra.toString());
		
		if(saida == resultado)return true;
		
		return false;
	}

}

