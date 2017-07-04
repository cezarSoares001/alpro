package classes;

public class ArvoreEnraizada {

	public int superposicaoDeArvores(ArvoreTernaria canhota, ArvoreTernaria destra) {

		int quantidadeNodosCanhota = canhota.getArvore().length - 1;
		int quantidadeNodosDestra = destra.getArvore().length - 1;
		
		int caminhoCentralRaizCanhota = canhota.getCaminhoCentralRaiz();
		int caminhoCentralRaizDestra = destra.getCaminhoCentralRaiz();		
		
		if(caminhoCentralRaizCanhota == caminhoCentralRaizDestra){
			return (quantidadeNodosCanhota + quantidadeNodosDestra) - caminhoCentralRaizCanhota;
		}		
		
		int contadorMaiorCaminhoCanhota = canhota.getMaiorCaminhoCentral();
		int contadorMaiorCaminhoDestra = destra.getMaiorCaminhoCentral();		
		
		if (contadorMaiorCaminhoCanhota == contadorMaiorCaminhoDestra) {
			return (quantidadeNodosCanhota + quantidadeNodosDestra) - contadorMaiorCaminhoCanhota;
		}

		if (contadorMaiorCaminhoCanhota > contadorMaiorCaminhoDestra) {
			return (quantidadeNodosCanhota + quantidadeNodosDestra) - contadorMaiorCaminhoDestra;
		}

		if (contadorMaiorCaminhoCanhota < contadorMaiorCaminhoDestra) {
			return (quantidadeNodosCanhota + quantidadeNodosDestra) - contadorMaiorCaminhoCanhota;
		}

		return 0;
	}

}
