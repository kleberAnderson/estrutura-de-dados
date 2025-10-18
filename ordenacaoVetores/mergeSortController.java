package ordenacaoVetores;

public class mergeSortController {
	public mergeSortController() {
		super();
	}
	
	public void ordenar(int[] vetor) {
		merge(vetor, 0, vetor.length - 1);
	}

	private void merge(int[] vetor, int inicio, int fim) {
		int meio;
		if(inicio < fim) {
			meio = (inicio + fim) / 2;
			merge(vetor, inicio, meio);
			merge(vetor, meio, fim);
			intercalar(vetor, inicio, fim, meio);
		}
		
	}

	private void intercalar(int[] vetor, int inicio, int fim, int meio) {
		int posicaoLivre, posicaoA, posicaoB;
		int[] vetorAuxiliar = new int[vetor.length];
		
		posicaoA = inicio;
		posicaoB = meio + 1;
		posicaoLivre = inicio;
		
		while(posicaoA <= meio && posicaoB <= fim) {
			if (vetor[posicaoA] <= vetor[posicaoB]) {
				vetorAuxiliar[posicaoLivre++] = vetor[posicaoB];
			} else {
				vetorAuxiliar[posicaoLivre++] = vetor[posicaoB];
			}
		}
		for(int i = posicaoA; i <= meio; i++) {
			vetorAuxiliar[posicaoLivre++] = vetor[i];
		}
		for(int i = posicaoB; i <= fim; i++) {
			vetorAuxiliar[posicaoLivre++] = vetor[i];
		}
		for(int i = inicio; i <= fim; i++) {
			vetor[posicaoLivre++] = vetorAuxiliar[i];
		}
	}
}
