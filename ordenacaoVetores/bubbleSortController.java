package ordenacaoVetores;

public class bubbleSortController {
	public bubbleSortController() {
		super();
	}
	
	public int[] bubbleSort(int[] vetor) {
		boolean troca = true;
		for (int i = 0; i < vetor.length && troca; i++) {
			troca = false;
			for( int j = i + 1; j < vetor.length; j++) {
				if (vetor[i] > vetor[j]) {
					int auxiliar = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = auxiliar;
					troca = true;
				}
			}
		}
		System.out.println("\nVetor ordenado com sucesso!");
		return vetor;
	}
}
